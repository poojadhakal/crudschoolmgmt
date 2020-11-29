package com.puzza.schoolmanagement.Exception;

import org.springframework.http.HttpStatus;

public class ApiException {
	private final String Message ;
	private final Throwable throwable;
	private final HttpStatus httpstatus;
	public ApiException(String message, Throwable throwable, HttpStatus httpstatus) {
		super();
		Message = message;
		this.throwable = throwable;
		this.httpstatus = httpstatus;
	}
	public String getMessage() {
		return Message;
	}
	public Throwable getThrowable() {
		return throwable;	}
	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

	
	} 
	


