package com.singtel.code.A2;

public class Chicken implements Animal{

	@Override
	public String move() {
		return "cannot fly";
	}

	@Override
	public String makeSound() {
		return "Cluck Cluck";
	}

	@Override
	public <R> R acceptVisitor(AnimalVisitor<R> visitor) {
		return visitor.visitChicken(this);
	}

}
