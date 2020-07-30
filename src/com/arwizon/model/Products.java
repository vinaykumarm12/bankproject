package com.arwizon.model;

public class Products 
{
	private static int count=101;
	private String name;
	private int price1;
	private int numunits;
	private int discount;
	private String category;
	private int productid;
	private String manufacturername;
	private String imageurl;
	
	public Products() {
		count++;
	}
	public static int getCou() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price1;
	}
	public void setPrice(int price1) {
		this.price1 = price1;
	}
	public int getNumunits() {
		return numunits;
	}
	public void setNumunits(int numunits) {
		this.numunits = numunits;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getManufacturername() {
		return manufacturername;
	}
	public void setManufacturername(String manufacturername) {
		this.manufacturername = manufacturername;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String toString() {
		return("product[name="+ name +",price="+price1+",discount="+discount+",productid="+productid
				+",manufacturename="+manufacturername+",num of units="+numunits+",category="+category
				+",toString()="+super.toString()+"]");
}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	
}
