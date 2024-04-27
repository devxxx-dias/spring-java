package br.mauricio.spring.services;

public interface IConverterDados {
    <T> T obterDados(String json, Class<T> classe);
}
