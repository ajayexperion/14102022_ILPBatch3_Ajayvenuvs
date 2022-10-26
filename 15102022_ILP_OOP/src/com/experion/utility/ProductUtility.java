package com.experion.utility;

import com.experion.entity.Product;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.inputProductDetails();
		//product.dispalyProductDetails();
		System.out.println("the product name is "+product.productName);
	}

}
