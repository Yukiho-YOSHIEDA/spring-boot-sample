package jp.ac.ritsumei.rcc.sample.exception

import jp.ac.ritsumei.rcc.sample.model.ExceptionResponse

class SampleException : Exception {
    protected val exceptionResponse: ExceptionResponse

    constructor() : super() {
        exceptionResponse = ExceptionResponse()
    }

    constructor(message: String) : super(message) {
        exceptionResponse = ExceptionResponse(message)
    }
}