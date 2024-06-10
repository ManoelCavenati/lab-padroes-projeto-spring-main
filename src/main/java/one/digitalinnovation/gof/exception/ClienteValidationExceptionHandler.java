package one.digitalinnovation.gof.exception;

import one.digitalinnovation.gof.model.Cliente;

public class ClienteValidationExceptionHandler extends AbstractClienteExceptionHandler {
    @Override
    public void handle(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente é obrigatório.");
        }
        next(cliente);
    }
}
