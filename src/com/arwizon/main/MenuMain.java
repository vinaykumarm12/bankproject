package com.arwizon.main;

import java.util.*;

import com.arwizon.model.Products;
import com.arwizon.service.ConnectionClass;
import com.arwizon.service.Newproduct;
import com.arwizon.service.ProductInterface;
import com.arwizon.service.Validation;
import com.arwizon.service.ProductInterface;

public class MenuMain {

	public static void main(String[] args) throws ProductInputException {
		Scanner scan = new Scanner(System.in);
		Validation v = new Validation();
		Map<Integer, Products> l = new HashMap<Integer, Products>();
		System.out.println("press 1 to add new product" + "\n press 2 to display products"
				+ "\n press 3 to search product" + "\n press 4 to delete product"+ "\n press 5 to update product");
		while (true) {
			System.out.println("please enter the option");
			int option = scan.nextInt();

			switch (option) {

			case 1:
				String name;
				while (true) {
					System.out.println("enter  name");
					name = scan.next();
					try {
						Validation.valid(name);
						break;
					} catch (ProductInputException e) {
						System.out.println(e.getmessage());
					}
				}
				String price;
				while (true) {
					System.out.println("enter price");
					price = scan.next();
					try {
						Validation.numvalid(price);
						break;
					} catch (ProductInputException e) {
						System.out.println(e.getmessage());
					}
				}
				int price1 = Integer.parseInt(price);
				String numunits;
				while (true) {
					System.out.println("enter num of units");
					numunits = scan.next();
					try {
						Validation.numvalid(numunits);
						break;
					} catch (ProductInputException e) {
						System.out.println(e.getmessage());
					}
				}
				int numunits1 = Integer.parseInt(numunits);
				String d;
				while (true) {
					System.out.println(" enter discount");
					d = scan.next();
					try {
						Validation.numvalid(d);
						break;
					} catch (ProductInputException e) {
						System.out.println(e.getmessage());
					}
				}
				int discount1 = Integer.parseInt(d);
				String cat;
				while (true) {
					System.out.println("enter the category");
					cat = scan.next();
					try {
						Validation.valid(cat);
						break;
					} catch (ProductInputException e) {
						System.out.println(e.getmessage());
					}
				}
				String m;
				while (true) {
					System.out.println("enter manufacturer name ");
					m = scan.next();
					try {
						Validation.valid(m);
						break;
					} catch (ProductInputException e) {
						System.out.println(e.getmessage());
					}
				}

				ProductInterface obj = new Newproduct();
				obj.createpro(name, price1, numunits1, discount1, cat, m);
				
				break;

			case 2:
				ProductInterface obj1 = new Newproduct();				
				Set<Products> pr=new HashSet<Products>();
				pr=obj1.display();
				for (Products temp : pr) {
			        System.out.println(temp);
				}
				break;
				
			case 3:
				while(true) {
				System.out.println(" enter product id to search");
				int name1 = scan.nextInt();
				ProductInterface obj3 = new Newproduct();
				obj3.search(name1);				
				break;
				}
			case 4:
				while(true) {
				System.out.println("enter the product id to delete");
				int id=scan.nextInt();
				ProductInterface prod2 = new Newproduct();
				ProductInterface obj4 = new Newproduct();
				obj4.delete(id);
				System.out.println("product deleted succesfully");
				break;
				}
			case 5:
				while(true) {
				System.out.println("enter the product id to update num of units");
				int pid=scan.nextInt();
				System.out.println("enter the number of items to be updated");
				int unit=scan.nextInt();
				ProductInterface obj5 = new Newproduct();
				obj5.update(pid, unit);
				break;
				}
				}
				
		}
	}
}
