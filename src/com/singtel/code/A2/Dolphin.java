package com.singtel.code.A2;

public class Dolphin implements Animal {

	@Override
	public String move() {
		return new Fish().move();
	}

	@Override
	public String makeSound() {
		return "can make sound";
	}

	@Override
	public <T> T acceptVisitor(AnimalVisitor<T> visitor) {
		return visitor.visitDolphin(this);
	}

}
