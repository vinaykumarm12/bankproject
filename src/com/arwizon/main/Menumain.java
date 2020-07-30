package com.arwizon.main;

import java.util.Scanner;

import com.arwizon.model.Products;
import com.arwizon.service.Newproduct;
import com.arwizon.service.Validation;
import com.arwizon.service.productInterface;
public class Menumain {

	public static void main(String[] args) throws Productinputexception {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number of products to add");
		int size = scan.nextInt();
		Products[] arr=new Products[size];
		Validation v=new Validation();
		System.out.println("press 1 to add new product" + "\n press 2 to display products"+"\n press 3 to search product");
		while (true) {
			System.out.println("please enter the option");
			int option = scan.nextInt();

			switch (option) {

			case 1:
				String name;
				while(true) {
					System.out.println("enter  name");
					 name = scan.next();
					try {
						Validation.valid(name);
						break;
					}
					catch(Productinputexception e) {
						System.out.println(e.getmessage());
					}
				}
				String price;
				while(true) {
					System.out.println("enter price");
					 price = scan.next();
					 try {
						Validation.numvalid(price);
					 break;
				}
					 catch(Productinputexception e) {
						 System.out.println(e.getmessage());
					 }
				}
				 int price1=Integer.parseInt(price);
				String numunits;
				while(true) {
					System.out.println("enter num of units");
					 numunits = scan.next();
					 try {
						 Validation.numvalid(numunits);
						 break;
					}
						 catch(Productinputexception e) {
							 System.out.println(e.getmessage());
						 }
					}
				 int numunits1=Integer.parseInt(numunits);
					 String d;
					 while(true) {
					System.out.println(" enter discount");
					d=scan.next();
					try {
						 Validation.numvalid(d);
						 break;
					}
						 catch(Productinputexception e) {
							 System.out.println(e.getmessage());
						 }
					}
					 int discount1=Integer.parseInt(d);
					 String cat;
					 while(true) {
					System.out.println("enter the category");
					 cat=scan.next();
					 try {
						 Validation.valid(cat);
						 break;
					}
						 catch(Productinputexception e) {
							 System.out.println(e.getmessage());
						 }
					}
					 String m;
					 while(true) {
					System.out.println("enter manufacturer name ");
					 m=scan.next();
					 try {
						 Validation.valid(m);
						 break;
					}
						 catch(Productinputexception e) {
							 System.out.println(e.getmessage());
						 }
					}
					productInterface obj=new Newproduct();
					Products p1=obj.createpro(name, price1, numunits1, discount1, cat, m);
					
					for (int i = 0; i < arr.length; i++) 
					{
				if(arr[i]==null) {
					arr[i]= p1;
					break;
				}
				}
				break;
			case 2:
				for (Products x : arr) {
					System.out.println(x);
				}
				break;
			case 3:
				System.out.println(" enter product name to search");
				String name1 = scan.next();
				productInterface prod=new Newproduct();
				Products[] product=prod.search(name1, arr);
				if(product[0]==null) {				
					System.out.println("no product found");
				}
				else {
					for(Products t:product) {
						if(t==null)
							break;
						else
							System.out.println(t);
					}
				}
				break;
	}
			}
}}
