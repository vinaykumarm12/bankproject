package com.arwizon.service;


import java.util.Map;
import java.util.Set;

import com.arwizon.model.Products;

public interface ProductInterface 
{
public  Products createpro(String name,int price1,int numunits,int discount,String category,
String manufacturename);

public Map<Integer,Products> search(int id, Map<Integer,Products> prodlist);
public Map<Integer,Products> delete(int id, Map<Integer,Products> prodlist);
public Map<Integer,Products> update(int pid,int unit,Map<Integer,Products> prodlist);

Map<Integer, Products> update(int pid, Products unit, Map<Integer, Products> prodlist);



}


