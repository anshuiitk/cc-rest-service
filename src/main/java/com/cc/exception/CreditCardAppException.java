package com.cc.exception;

/**
 * Custom Exception to track application related errors
 */
public class CreditCardAppException extends Exception {

    public CreditCardAppException(String message) {
        super(message);
    }

    public CreditCardAppException(String message, Throwable exception) {
        super(message, exception);
    }
}
