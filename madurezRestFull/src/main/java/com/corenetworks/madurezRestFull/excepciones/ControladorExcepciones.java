package com.corenetworks.madurezRestFull.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;


@RestController//controlador
@ControllerAdvice//controlador excepciones

public class ControladorExcepciones extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ExceptionNoEncontrado.class)
    public ResponseEntity<ExceptionPretty> atrapaExcepcionNoEncontrada(ExceptionNoEncontrado ex, WebRequest request){
        ExceptionPretty e= new ExceptionPretty(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
    }

}
