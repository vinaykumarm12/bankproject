package com.arwizon.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.arwizon.model.Products;

public class Newproduct implements ProductInterface {
	@Override
	public Products createpro(String name, int price, int numunits, int discount, String category,
			String manufacturename) {

		Products p = new Products();
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
	public Map<Integer, Products> search(int id, Map<Integer, Products> prodlist) {
		Map<Integer, Products> l1 = new HashMap<Integer, Products>();
		Set<Integer> s = prodlist.keySet();
		for (Integer p : s) {
			if (p == id) {
				l1.put(p, prodlist.get(p));
			}
		}
		return l1;

	}

	@Override
	public Map<Integer, Products> delete(int id, Map<Integer, Products> prodlist) {
		Set<Integer> s = prodlist.keySet();
		for (Integer p : s) {
			if (p == id) {
				prodlist.remove(p);
				break;
			}

		}
		return prodlist;
	}

	@Override
	public Map<Integer, Products> update(int pid, int unit, Map<Integer, Products> prodlist) {
		Products produ=new Products();
		Set<Integer> s=prodlist.keySet();
		for (Integer p : s) 
		{	
			if(p==pid) 
			{
				produ.setNumunits(unit);
				prodlist.put(pid, produ);
			
		break;
		}
	}

	return prodlist;
	}

	@Override
	public Map<Integer, Products> update(int pid, Products unit, Map<Integer, Products> prodlist) {
		// TODO Auto-generated method stub
		return null;
	}

}
