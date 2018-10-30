package com.singtel.code.A2;

public class Cat implements Animal {
	@Override
	public String move() {
		return "can walk and run";
	}

	@Override
	public String makeSound() {
		return "Meow, meow";
	}

	@Override
	public <R> R acceptVisitor(AnimalVisitor<R> visitor) {
		return visitor.visitCat(this);
		
	}
}
