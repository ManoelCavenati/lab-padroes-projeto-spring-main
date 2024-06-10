package one.digitalinnovation.gof.exception;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteDuplicateCheckExceptionHandler extends AbstractClienteExceptionHandler {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void handle(Cliente cliente) {
        if (clienteRepository.existsById(cliente.getId())) {
            throw new IllegalArgumentException("Cliente já existe.");
        }
        next(cliente);
    }
}
