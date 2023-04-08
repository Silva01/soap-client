package br.net.silva.daniel.domain.soap.interfaces;

public interface Soap<T> {
    T send(String url);
}
