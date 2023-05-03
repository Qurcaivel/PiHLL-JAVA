package com.inqognitoo.spring.errors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor {

    private static final Logger logger = LogManager.getLogger();

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorMessage> argumentHandle(IllegalArgumentException e){
        logger.error("Argument exception");

        ErrorMessage message = new ErrorMessage(400, e.getMessage());
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> unexpectedHandle(Exception e){
        logger.error("Unknown exception");

        ErrorMessage message = new ErrorMessage(500, "An unexpected error has occurred");
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}