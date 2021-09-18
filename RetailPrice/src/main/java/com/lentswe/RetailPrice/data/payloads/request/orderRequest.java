package com.lentswe.RetailPrice.data.payloads.request;

import com.lentswe.RetailPrice.data.models.Category;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OrderRequest{
	
	@NotBlank,
	@NotNull
	private Integer productQuantity;
	@NotBlank,
	@NotNull
	private float productTotal,
	@NotBlank,
	@NotNull
	private string discount;
	@NotBlank,
	@NotNull
	private Date orderDate;
	@NotBlank,
	@NotNull
	private float amount;
	@NotBlank,
	@NotNull
	private String accountrId;
	
	@Enumerated(EnumType.STRING)
	private Discount discount;

	public Integer getproductQuantity(){
		return productQuantity;
	}
	public void setproductQuantity(Integer productQuantity){
		this.productQuantity = productQuantity;
	}
	public float getproductTotal(){
		return productTotal;
	}
	public void setproductTotal(float productTotal){
		this.productTotal = productTotal;
	}
	public float getDiscount(){
		return float;
	}
	public void setDiscount(float discount){
		this.discount = discount;

	}
	public Date getOrderDate(){
		return orderDate;
	}
	public void setOrderDate(String orderDate){
		this.orderDate = orderDate;
	}
	public float getamount(){
		return amount;
	}public void setAmount( float amount){
		this.amount = amount;
	}
	public String getaccountId(){
		return accountId
	}
	public void setaccountId(String accountId){
		this.accountId = accountId;
	}
	
}

