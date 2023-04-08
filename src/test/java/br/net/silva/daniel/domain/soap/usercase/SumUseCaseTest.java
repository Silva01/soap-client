package br.net.silva.daniel.domain.soap.usercase;

import br.net.silva.daniel.domain.soap.domain.SoapService;
import br.net.silva.daniel.domain.soap.dto.SoapResponseDTO;
import br.net.silva.daniel.domain.soap.interfaces.Soap;
import junit.framework.TestCase;

public class SumUseCaseTest extends TestCase {

    private Soap<SoapResponseDTO> soap = new SoapService();

    public void test_deve_somar_2_numeros() {
        SumUseCase sumUseCase = new SumUseCase(soap);
        sumUseCase.addNumber(2, 2);
        SoapResponseDTO response = sumUseCase.execute();
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n" +
                "<SOAP-ENV:Envelope xmlns:SOAP-ENV='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:s='http://www.w3.org/2001/XMLSchema'>\r\n" +
                "  <SOAP-ENV:Body><AddIntegerResponse xmlns=\"http://tempuri.org\"><AddIntegerResult>4</AddIntegerResult></AddIntegerResponse></SOAP-ENV:Body>\r\n" +
                "</SOAP-ENV:Envelope>".trim(), response.getResponse().trim());
    }
}