package br.net.silva.daniel.domain.soap.domain;

import br.net.silva.daniel.domain.soap.dto.SoapResponseDTO;
import br.net.silva.daniel.domain.soap.interfaces.Soap;
import org.springframework.web.client.RestTemplate;

public class SoapService implements Soap<SoapResponseDTO> {
    private final RestTemplate restTemplate;
    public SoapService() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    public SoapResponseDTO send(String url) {
        return new SoapResponseDTO(restTemplate.getForObject(url, String.class));
    }
}
