package br.com.digitalinnovationone.apivisitante.exception;

public class NomeInvalidoException extends RuntimeException {

    public NomeInvalidoException() {
        super("nome não informado");
    }

}
