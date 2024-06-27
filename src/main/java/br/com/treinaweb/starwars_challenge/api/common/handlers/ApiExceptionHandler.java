package br.com.treinaweb.starwars_challenge.api.common.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.treinaweb.starwars_challenge.api.common.dtos.MessageResponse;
import br.com.treinaweb.starwars_challenge.core.exceptions.PlanetNotFoundException;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(PlanetNotFoundException.class)
    public MessageResponse handlePlanetNotFoundException(
        PlanetNotFoundException exception
    ) {
        return new MessageResponse(exception.getLocalizedMessage());
    }
    
}
