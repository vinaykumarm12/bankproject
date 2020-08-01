package com.arwizon.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.arwizon.model.Products;

public class Newproduct implements ProductInterface {
	Connection con=ConnectionClass.connectDb();
	@Override
	public void createpro(String name, int price, int numunits, int discount, String category,
			String manufacturename) 
	{
		
		try {
			String sq="select max(productid) from Products";
			PreparedStatement st=con.prepareStatement(sq);
			ResultSet rs=st.executeQuery();
			int i=101;
			while(rs.next()) {
			String sql="insert into products values(?,?,?,?,?,?,?)";
			PreparedStatement st1=con.prepareStatement(sql);
			st1.setInt(1,i+1);
			st1.setString(2, name);
			st1.setInt(3, price);
			st1.setInt(4, numunits);
			st1.setInt(5, discount);
			st1.setString(6, category);
			st1.setString(7, manufacturename);
			st1.executeUpdate();
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
			
		
	
		/*Products p = new Products();
		p.setName(name);
		p.setPrice(price);
		p.setNumunits(numunits);
		p.setDiscount(discount);
		p.setCategory(category);
		p.setManufacturername(manufacturename);
		p.setProductid(Products.getCou());
		Products.getCou();*/
		
	}

	@Override
	public Set<Products> search(int id) 
	{
		Set<Products> Prolist=new HashSet<Products>();
		
		try {
			String sql="select * from Products where productid=?";
			PreparedStatement st=con.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				Products p=new Products();
				p.setProductid(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setDiscount(rs.getInt(4));
				p.setNumunits(rs.getInt(5));
				p.setCategory(rs.getString(6));
				p.setManufacturername(rs.getString(7));
				Prolist.add(p);
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}
		return Prolist;
		

	}

	@Override
	public void delete(int id ) 
	{
		String sql="delete from Products ehere productid=?";
		try {
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void update(int pid, int unit) 
	{
		String sql="update Products set num_units=? where productid=?";
		try {
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(2, pid);
			st.setInt(1, unit);
			st.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Set<Products> display() 
	{
		Set<Products> Prolist=new HashSet<Products>();
		String sql="select * from Products ";
		try {					
			PreparedStatement st=con.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				Products p=new Products();
				p.setProductid(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setDiscount(rs.getInt(4));
				p.setNumunits(rs.getInt(5));
				p.setCategory(rs.getString(6));
				p.setManufacturername(rs.getString(7));
				Prolist.add(p);
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return Prolist;
}
}