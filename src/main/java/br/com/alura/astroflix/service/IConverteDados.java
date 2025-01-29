package br.com.alura.astroflix.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> Classe);
}
