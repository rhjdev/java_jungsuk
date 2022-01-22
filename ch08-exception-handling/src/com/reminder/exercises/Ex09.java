package com.reminder.exercises;

public class Ex09 {

	public static void main(String[] args) throws Exception {
		
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
	}
}

class UnsupportedFunctionException extends RuntimeException {
	final private int ERR_CODE;
	
	public UnsupportedFunctionException(String message, int errCode) {
		super(message);
		ERR_CODE = errCode;
	}
	
	public UnsupportedFunctionException(String message) {
		this(message, 100);
	}
	public int getErrorCode() {
		return ERR_CODE;
	}

	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}