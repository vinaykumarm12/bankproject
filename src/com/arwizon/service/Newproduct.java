package com.arwizon.service;

import com.arwizon.model.Products;

public class Newproduct implements productInterface{
	@Override
	public Products createpro(String name, int price, int numunits, int discount, String category,
			String manufacturename) {
		
		Products p=new Products();
		p.setName(name);
		p.setPrice(price);
		p.setNumunits(numunits);
		p.setDiscount(discount);
		p.setCategory(category);
		p.setManufacturername(manufacturename);
		p.setProductid(Products.getCou());
		Products.getCou();
		return p;
	}

	@Override
	public Products[] search(String name, Products[] arr) {
		Products[] arr1=new Products[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(name.equals(arr[i].getName()))
			{
				arr1[j]=arr[i];
					j++;	
			}
		}
		return arr1;
			}

	
	}

	

	


