package com.lentswe.RetailPrice.data.payloads.request;

import com.lentswe.RetailPrice.data.models.Category;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductRequest{
	@NotBlank,
	@NotNull
	private String code;
	@NotBlank,
	@NotNull
	private String productName;
	@NotBlank,
	@NotNull
	private float price,
	@NotBlank,
	@NotNull
	private string productCategory;
	@NotBlank,
	@NotNull
	private string dateCreated
	@NotBlank,
	@NotNull
	@Enumerated(EnumType.STRING)
	private Category category;

	public String getCode(){
		return code;
	}
	public void setCode(String code){
		this.code = code;
	}
	public String getproductName(){
		return productName;
	}
	public void setproductName(String productName){
		this.productName = productName;
	}
	public float getprice(){
		return price;
	}
	public void setprice(float price){
		this.price = price;
	}
	public String getdateCreated(){
		return dateCreated;
	}
	public void setdateCreated(String dateCreated){
		this.dateCreated = dateCreated;
	}
	public String getproductCategory(){
		return productCategory;
	}
	public void setproductCategory(String productCategory){
		this.productCategory = productCategory;
	}
}

