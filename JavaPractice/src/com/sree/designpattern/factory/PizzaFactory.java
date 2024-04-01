package com.sree.designpattern.factory;

public class PizzaFactory {
	
	public static Pizaa createPizza(String type) {
		Pizaa p=null;
		
		if(type.equalsIgnoreCase("cheese")) {
			p= new CheesePizza();
		}
		
		if(type.equalsIgnoreCase("chicken")) {
			p= new ChickenPizza();
		}
		
		if(type.equalsIgnoreCase("veg")) {
			p= new VegPizza();
		}
		
		return p;
		
		
	}

}
