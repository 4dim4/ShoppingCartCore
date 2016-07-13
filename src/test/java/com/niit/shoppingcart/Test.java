package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		Category c=(Category) context.getBean("cat!");
		c.setId("C101");
		c.setName("Dell");
		c.setDescription("Laptop");
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getDescription());
		System.out.println("Category Created!");
		Product p=(Product) context.getBean("pro!");
		p.setPrice(10000);
		p.setProdID("PR01");
		p.setProdName("Dell");
		System.out.println(p.getProdID());
		System.out.println(p.getProdName());
		System.out.println(p.getPrice());
		System.out.println("Product Created!");
		context.close();
	}

}
