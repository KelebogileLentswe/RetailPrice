package com.lentswe.RetailPrice.data.payloads.response;

public class MessageResponse{

	private String message;

	public MessageResponse(String message){
		this.message = message;
	}
	public void setMessage(String message){
		this.message = message;
	}
	public String getMesssage(){
		return message;
	}
}