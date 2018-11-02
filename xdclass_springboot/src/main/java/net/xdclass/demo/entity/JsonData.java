package net.xdclass.demo.entity;

import java.io.Serializable;

public class JsonData implements Serializable{


	private static final long serialVersionUID = 1L;
	private int code;
	private String errorMessage;
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public JsonData(int code, Object data) {
		super();
		this.code = code;
		this.data = data;
	}
	public JsonData(int code, String errorMessage, Object data) {
		super();
		this.code = code;
		this.errorMessage = errorMessage;
		this.data = data;
	}
	
}
