package com.arwizon.main;

public class Productinputexception extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public Productinputexception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
