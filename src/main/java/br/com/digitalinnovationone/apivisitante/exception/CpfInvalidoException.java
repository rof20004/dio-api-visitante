package br.com.digitalinnovationone.apivisitante.exception;

public class CpfInvalidoException extends RuntimeException {

    public CpfInvalidoException() {
        super("cpf inválido ou não informado");
    }

}
