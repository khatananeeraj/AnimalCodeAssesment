package com.singtel.code.A2;

public class Dog implements Animal {
	@Override
	public String move() {
		return "can walk and run";
	}

	@Override
	public String makeSound() {
		return "Woof, woof";
	}

	@Override
	public <R> R acceptVisitor(AnimalVisitor<R> visitor) {
		return visitor.visitDog(this);
	}
}
