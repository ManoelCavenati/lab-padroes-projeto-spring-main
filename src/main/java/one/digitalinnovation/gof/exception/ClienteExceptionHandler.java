package one.digitalinnovation.gof.exception;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteExceptionHandler {
    void setNext(ClienteExceptionHandler handler);

    void handle(Cliente cliente);
}
