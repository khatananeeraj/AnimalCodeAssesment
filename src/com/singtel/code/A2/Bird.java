package com.singtel.code.A2;

class Bird implements Animal {
	private String walk() {
		return "can walk";
	}
	private String fly() {
		return "can fly";
	}
	private String sing() {
		return "can sing";
	}
	@Override
	public String move() {
		return walk() + " and " + fly();
		
	}
	@Override
	public String makeSound() {
		return sing();
	}
	@Override
	public <R> R acceptVisitor(AnimalVisitor<R> visitor) {
		return visitor.visitBird(this);
	}
}