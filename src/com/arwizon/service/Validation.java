package com.arwizon.service;

import com.arwizon.main.ProductInputException;

public class Validation {
public static void valid(String name) throws ProductInputException 
{  
		String pat="[A-Za-z]{3,}";
		if(!name.matches(pat)) 
		{ 
		throw new ProductInputException(" should be  valid characters");
		}
		
}
public static void numvalid(String disc) throws ProductInputException
{
{
	String pattern="[1-9]{1}[0-9]+";
	if(!disc.matches(pattern))
	{
		throw new ProductInputException("enter valid positive number");
	}
}
}}		