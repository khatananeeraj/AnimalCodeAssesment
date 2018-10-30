package com.singtel.code.A2;

public class Fish implements Animal {
	
	private String name = "Fish";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String move() {
		return "can swim";
	}

	@Override
	public String makeSound() {
		return "cannot make sound";
	}

	@Override
	public <T> T acceptVisitor(AnimalVisitor<T> visitor) {
		return visitor.visitFish(this);
	}

}
