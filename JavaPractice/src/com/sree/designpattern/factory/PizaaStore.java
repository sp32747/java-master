package com.sree.designpattern.factory;

public class PizaaStore {

	public Pizaa orderPizza(String type) {
		Pizaa p=PizzaFactory.createPizza(type);
		
		p.prepare();
		p.bake();
		p.cut();
		
		
		
		return p;
	}
	
	
	
	
}
