package jp.ac.ritsumei.rcc.sample.handler

import jp.ac.ritsumei.rcc.sample.model.ExceptionResponse
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class SampleExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler
    fun handleAllException(ex: Exception, request: WebRequest): ResponseEntity<Any> {
        val exceptionResponse = ExceptionResponse("SampleException")
        ex.printStackTrace()
        return super.handleExceptionInternal(ex, exceptionResponse, HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR, request)
    }
}