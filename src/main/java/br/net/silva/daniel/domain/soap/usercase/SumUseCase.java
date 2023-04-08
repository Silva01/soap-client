package br.net.silva.daniel.domain.soap.usercase;

import br.net.silva.daniel.domain.soap.dto.SoapResponseDTO;
import br.net.silva.daniel.domain.soap.interfaces.Soap;

public class SumUseCase {
    private static final String URL = "https://www.crcind.com/csp/samples/SOAP.Demo.cls?soap_method=AddInteger&Arg1=%d&Arg2=%d";

    private final Soap<SoapResponseDTO> soap;
    private int number1;
    private int number2;
    public SumUseCase(Soap<SoapResponseDTO> soap) {
        this.soap = soap;
    }

    public void addNumber(int a, int b) {
        this.number1 = a;
        this.number2 = b;
    }

    public SoapResponseDTO execute() {
        return soap.send(String.format(URL, number1, number2));
    }
}
