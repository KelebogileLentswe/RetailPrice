package com.lentswe.RetailPrice.data.payloads.request;

import com.lentswe.RetailPrice.data.models.Category;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class AccountRequest{
	
	@NotBlank,
	@NotNull
	private String fullName;
	@NotBlank,
	@NotNull
	private String phoneNumber;
	@NotBlank,
	@NotNull
	private string email;
	@NotBlank,
	@NotNull
	private boolean isActive;
	@NotBlank,
	@NotNull
    
	private String userRole,
	@NotBlank,
	@NotNull
	private string dateCreated;
	
	@Enumerated(EnumType.STRING)
	private Account Account;

	private string dateCreated;

	public Integer getfullName(){
		return fullName;
	}
	public void setfullName(Integer fullName){
		this.fullName = fullName;
	}
	public String getphoneNumber(){
		return phoneNumber;
	}
	public void setphoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public String getemail(){
		return email;
	}
	public void getEmail(String email){
		this.email = email;
	}
	public boolean getIsActive(){
		return isActive;
	}
	public void setIsActive( boolean isActive){
		this.isActive = isActive;
	}
	public String getUserRole(){
		return userRole;
	}
	public void setuserRole(String userRole){
		this.userRole = userRole;

	}
}

