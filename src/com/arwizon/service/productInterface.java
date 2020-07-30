package com.arwizon.service;

import com.arwizon.model.Products;

public interface productInterface 
{
public  Products createpro(String name,int price1,int numunits,int discount,String category,
String manufacturename);

public Products[] search(String name,Products[] arr);
}


