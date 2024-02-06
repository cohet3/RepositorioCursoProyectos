package com.corenetworks.validaciones.excepciones;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestController
@ControllerAdvice

public class ControladorExcepciones extends ResponseEntityExceptionHandler {
    //sobreescribimos el MethodArgumentNotValidException
    //@ExceptionHandler(Exception.class) con esto metemos todas las excepciones, incluir en el proyecto repasoRelaciones

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        String mensaje = ex.getBindingResult().getAllErrors().stream().map(e -> {
            return e.getDefaultMessage().concat(", ");
        }).collect(Collectors.joining());
        ExcepcionRespuesta e1= new ExcepcionRespuesta(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(e1, HttpStatus.BAD_REQUEST);
    }
}
