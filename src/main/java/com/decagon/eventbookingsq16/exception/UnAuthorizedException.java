package com.decagon.eventbookingsq16.exception;

public class UnAuthorizedException extends RuntimeException{
    public UnAuthorizedException(String msg){
        super(msg);
    }
}
