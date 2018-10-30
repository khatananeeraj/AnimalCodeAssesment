package com.singtel.code.A2;

public class Duck  implements Animal {

	@Override
	public String move() {
		return "can swim";
	}

	@Override
	public String makeSound() {
		return "Quack, quack";
	}

	@Override
	public <R> R acceptVisitor(AnimalVisitor<R> visitor) {
		return visitor.visitDuck(this);
	}

}
