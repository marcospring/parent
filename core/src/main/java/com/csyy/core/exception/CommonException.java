package com.csyy.core.exception;

public class CommonException extends BusinessException {
	private static final long serialVersionUID = 1L;

	public CommonException() {
	}
	
	public CommonException(String exceptionKey) {
		setExceptionKey(exceptionKey);
	}

	public CommonException(String exceptionKey,String ... args){
		setExceptionKey(exceptionKey);
		setArgs(args);
	}
}
