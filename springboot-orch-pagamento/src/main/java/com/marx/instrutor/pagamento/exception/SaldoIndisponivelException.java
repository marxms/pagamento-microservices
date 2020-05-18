package com.marx.instrutor.pagamento.exception;

import org.springframework.http.HttpStatus;

public class SaldoIndisponivelException extends RuntimeException{
	  private static final long serialVersionUID = 1L;

	  private final String message;
	  private final HttpStatus httpStatus;

	  public SaldoIndisponivelException(String message, HttpStatus httpStatus) {
	    this.message = message;
	    this.httpStatus = httpStatus;
	  }

	  @Override
	  public String getMessage() {
	    return message;
	  }

	  public HttpStatus getHttpStatus() {
	    return httpStatus;
	  }


}
