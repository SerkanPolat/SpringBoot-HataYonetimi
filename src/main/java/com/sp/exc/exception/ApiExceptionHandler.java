package com.sp.exc.exception;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//RestContollerlardan firlatilan hatalari toplar.
@RestControllerAdvice
public class ApiExceptionHandler {
    //Entity Not Found Hatasi alindiginda calisacak olan metod
    @ExceptionHandler({EntityNotFoundException.class})
    public String entityNotFound(){

        return "BOS GELIYOR BOS KAYIT YOK";
    }
    @ExceptionHandler({MissingServletRequestParameterException.class})
    public String parametreRequired(){
        return "Paramaetre lazim Parametresiz Olmaz Hata Uretiyorum :D";
    }
}
