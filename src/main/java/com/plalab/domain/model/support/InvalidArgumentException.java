package com.plalab.domain.model.support;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidArgumentException extends RuntimeException{
    public InvalidArgumentException(String msg){
        super(msg);
    }
}
