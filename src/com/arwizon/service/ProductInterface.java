package com.arwizon.service;


import java.util.Map;
import java.util.Set;

import com.arwizon.model.Products;

public interface ProductInterface 
{
public  void createpro(String name,int price1,int numunits,int discount,String category,
String manufacturename);

public Set<Products> search(int id);
public Set<Products> display();
public void delete(int id);
public void update(int pid,int unit);





}


