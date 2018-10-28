package jp.ac.ritsumei.rcc.sample.handler;

import jp.ac.ritsumei.rcc.sample.exception.SampleException;
import jp.ac.ritsumei.rcc.sample.model.ExceptionResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SampleExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * すべてのExceptionをハンドリングします
     *
     * @param ex
     * @param request
     * @return
     */
    @ExceptionHandler
    public ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {
        SampleException exceptionResponse = new SampleException("SampleException");
        ex.printStackTrace();
        return super.handleExceptionInternal(ex, exceptionResponse, null,
                HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
                                                             HttpStatus status, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setMessage("SampleException");
        return super.handleExceptionInternal(ex, exceptionResponse, headers,
                status, request);
    }
}
