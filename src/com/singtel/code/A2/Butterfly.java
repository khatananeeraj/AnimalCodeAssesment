package com.singtel.code.A2;

public class Butterfly implements Animal, AnimalState {
	
	private String name = "Butterfly Adult";

	@Override
	public String move() {
		return "can fly";
	}

	@Override
	public String makeSound() {
		return "does not make a sound";
	}

	@Override
	public <T> T acceptVisitor(AnimalVisitor<T> visitor) {
		return visitor.visitButterfly(this);
	}

	@Override
	public String living() {
		//this.setName("Butterfly Adult");
		return "Butterfly is in " + this.getName() + " state.";
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
