package br.net.silva.daniel.domain.soap.usercase;

import br.net.silva.daniel.domain.soap.domain.SoapService;
import br.net.silva.daniel.domain.soap.dto.SoapResponseDTO;
import br.net.silva.daniel.domain.soap.interfaces.Soap;
import junit.framework.TestCase;

public class NameSearchUseCaseTest extends TestCase {

    private final Soap<SoapResponseDTO> soap = new SoapService();

    public void test_deve_pesquisar_por_adam() {
        NameSearchUseCase nameSearchUseCase = new NameSearchUseCase(soap);
        nameSearchUseCase.addName("Adam");
        SoapResponseDTO response = nameSearchUseCase.execute();
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<SOAP-ENV:Envelope xmlns:SOAP-ENV='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:s='http://www.w3.org/2001/XMLSchema'>\n" +
                "  <SOAP-ENV:Body><QueryByNameResponse xmlns=\"http://tempuri.org\"><QueryByNameResult>\n" +
                "<s:schema id=\"QueryByName_DataSet\" targetNamespace=\"http://tempuri.org/QueryByName_DataSet\" xmlns=\"http://tempuri.org/QueryByName_DataSet\" xmlns:mstns=\"http://tempuri.org/QueryByName_DataSet\" attributeFormDefault=\"qualified\" elementFormDefault=\"qualified\" xmlns:s=\"http://www.w3.org/2001/XMLSchema\" xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\">\n" +
                "  <s:element name=\"QueryByName_DataSet\" msdata:IsDataSet=\"true\">\n" +
                "    <s:complexType>\n" +
                "      <s:choice maxOccurs=\"unbounded\">\n" +
                "        <s:element name=\"QueryByName\">\n" +
                "          <s:complexType>\n" +
                "            <s:sequence>\n" +
                "              <s:element name=\"ID\" type=\"s:long\" minOccurs=\"0\" />\n" +
                "              <s:element name=\"Name\" type=\"s:string\" minOccurs=\"0\" />\n" +
                "              <s:element name=\"DOB\" type=\"s:date\" minOccurs=\"0\" />\n" +
                "              <s:element name=\"SSN\" type=\"s:string\" minOccurs=\"0\" />\n" +
                "            </s:sequence>\n" +
                "          </s:complexType>\n" +
                "        </s:element>\n" +
                "      </s:choice>\n" +
                "    </s:complexType>\n" +
                "    <s:unique name=\"Constraint1\" msdata:PrimaryKey=\"true\">\n" +
                "      <s:selector xpath=\".//mstns:QueryByName\" />\n" +
                "      <s:field xpath=\"mstns:ID\" />\n" +
                "    </s:unique>\n" +
                "  </s:element>\n" +
                "</s:schema>\n" +
                "<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">\n" +
                "<QueryByName_DataSet xmlns=\"http://tempuri.org/QueryByName_DataSet\">\n" +
                "  <QueryByName diffgr:id=\"QueryByName1\" msdata:rowOrder=\"0\">\n" +
                "    <ID>96</ID>\n" +
                "    <Name>Adam,Wolfgang F.</Name>\n" +
                "    <DOB>1991-02-12</DOB>\n" +
                "    <SSN>850-53-6279</SSN>\n" +
                "  </QueryByName>\n" +
                "  <QueryByName diffgr:id=\"QueryByName2\" msdata:rowOrder=\"1\">\n" +
                "    <ID>188</ID>\n" +
                "    <Name>Adams,Phil H.</Name>\n" +
                "    <DOB>1972-11-24</DOB>\n" +
                "    <SSN>729-18-4435</SSN>\n" +
                "  </QueryByName>\n" +
                "</QueryByName_DataSet>\n" +
                "</diffgr:diffgram>\n" +
                "</QueryByNameResult></QueryByNameResponse></SOAP-ENV:Body>\n" +
                "</SOAP-ENV:Envelope>".trim(), response.getResponse().trim().replace("\r\n", "\n"));
    }
}