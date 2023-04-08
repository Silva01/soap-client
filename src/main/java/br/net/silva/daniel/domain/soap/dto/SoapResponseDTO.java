package br.net.silva.daniel.domain.soap.dto;

public class SoapResponseDTO {
    private final String response;

    public SoapResponseDTO(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }
}
