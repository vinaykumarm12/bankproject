package com.arwizon.service;

import com.arwizon.main.Productinputexception;

public class Validation {
public static void valid(String name) throws Productinputexception 
{  
		String pat="[A-Za-z]{3,}";
		if(!name.matches(pat)) 
		{ 
		throw new Productinputexception(" should be  valid characters");
		}
		
}
public static void numvalid(String disc) throws Productinputexception
{
{
	String pattern="[1-9]{1}[0-9]+";
	if(!disc.matches(pattern))
	{
		throw new Productinputexception("enter valid positive number");
	}
}
}}		