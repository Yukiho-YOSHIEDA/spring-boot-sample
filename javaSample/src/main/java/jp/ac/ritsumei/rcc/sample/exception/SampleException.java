package jp.ac.ritsumei.rcc.sample.exception;

import jp.ac.ritsumei.rcc.sample.model.ExceptionResponse;

public class SampleException extends Exception {
    protected ExceptionResponse exceptionResponse;

    public SampleException() {
        super();
        exceptionResponse = new ExceptionResponse();
    }

    public SampleException(String message) {
        super(message);
        exceptionResponse = new ExceptionResponse();
        exceptionResponse.setMessage(message);
    }
}
