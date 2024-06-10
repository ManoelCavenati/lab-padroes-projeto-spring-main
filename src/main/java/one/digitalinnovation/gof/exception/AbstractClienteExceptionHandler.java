package one.digitalinnovation.gof.exception;

import one.digitalinnovation.gof.model.Cliente;

public abstract class AbstractClienteExceptionHandler implements ClienteExceptionHandler {
    protected ClienteExceptionHandler nextHandler;

    @Override
    public void setNext(ClienteExceptionHandler handler) {
        this.nextHandler = handler;
    }

    protected void next(Cliente cliente) {
        if (nextHandler != null) {
            nextHandler.handle(cliente);
        }
    }
}
