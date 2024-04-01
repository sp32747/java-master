package com.sree.designpattern.factory;

public class CheesePizza implements Pizaa {

	@Override
	public void prepare() {
		System.out.println("preparing cheese pizza");
	}

	@Override
	public void bake() {
		System.out.println("baking cheese pizza");
	}

	@Override
	public void cut() {
		System.out.println("cutting cheese pizza");
	}

}
