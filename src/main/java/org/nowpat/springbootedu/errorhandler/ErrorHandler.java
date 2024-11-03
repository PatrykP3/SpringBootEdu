package org.nowpat.springbootedu.errorhandler;

import lombok.extern.slf4j.Slf4j;
import org.nowpat.springbootedu.exception.PersonNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
@Slf4j
public class ErrorHandler {

    @ExceptionHandler(value = PersonNotFoundException.class)
    public ResponseEntity<String> handle(PersonNotFoundException ex) {
        log.error("Person not found exception: ", ex);
        return new ResponseEntity<>(ex.getMessage(), new HttpHeaders(), NOT_FOUND);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<String> handle(Exception ex) {
        log.error("Unhandled / Unexpected Exception: ", ex);
        return new ResponseEntity<>(ex.getMessage(), new HttpHeaders(), INTERNAL_SERVER_ERROR);
    }


}
