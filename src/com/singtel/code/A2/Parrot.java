package com.singtel.code.A2;


public class Parrot extends Bird implements Animal {

	private String sound = "Squeak Squeak";
	
	public void livingWith(Animal animal) {
		sound = animal.makeSound();
	}
	public void livingWithPhone() {
		sound = "Tring Tring";
	}

	@Override
	public String makeSound() {
		return sound;
	}

	@Override
	public <T> T acceptVisitor(AnimalVisitor<T> visitor) {
		return visitor.visitParrot(this);
	}

}
