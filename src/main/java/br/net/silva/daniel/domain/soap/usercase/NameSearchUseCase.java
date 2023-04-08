package br.net.silva.daniel.domain.soap.usercase;

import br.net.silva.daniel.domain.soap.dto.SoapResponseDTO;
import br.net.silva.daniel.domain.soap.interfaces.Soap;

public class NameSearchUseCase {

    private static final String URL = "https://www.crcind.com/csp/samples/SOAP.Demo.cls?soap_method=QueryByName&name=%s";
    private String name;

    private final Soap<SoapResponseDTO> soap;

    public NameSearchUseCase(Soap<SoapResponseDTO> soap) {
        this.soap = soap;
    }

    public void addName(String name) {
        this.name = name;
    }
    public SoapResponseDTO execute() {
        return soap.send(String.format(URL, name));
    }
}
