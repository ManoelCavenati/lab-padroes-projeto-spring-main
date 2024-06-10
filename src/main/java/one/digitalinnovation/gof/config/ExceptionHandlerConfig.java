package one.digitalinnovation.gof.config;

import one.digitalinnovation.gof.exception.ClienteDuplicateCheckExceptionHandler;
import one.digitalinnovation.gof.exception.ClienteValidationExceptionHandler;
import one.digitalinnovation.gof.exception.ClienteExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExceptionHandlerConfig {

    @Bean
    public ClienteExceptionHandler clienteValidationExceptionHandler() {
        return new ClienteValidationExceptionHandler();
    }

    @Bean
    public ClienteExceptionHandler clienteDuplicateCheckExceptionHandler() {
        ClienteExceptionHandler validationHandler = clienteValidationExceptionHandler();
        ClienteExceptionHandler duplicateCheckHandler = new ClienteDuplicateCheckExceptionHandler();

        validationHandler.setNext(duplicateCheckHandler);

        return validationHandler;
    }
}
