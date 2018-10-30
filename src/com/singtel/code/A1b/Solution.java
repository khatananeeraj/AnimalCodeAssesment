package com.singtel.code.A1b;

interface Animal {
	void move();
	void makeSound();
}

class Bird implements Animal {
	private void walk() {
		System.out.println("I am flying");
	}
	private void fly() {
		System.out.println("I am flying");
	}
	private void sing() {
		System.out.println("I am singing");
	}
	@Override
	public void move() {
		walk();
		fly();
		
	}
	@Override
	public void makeSound() {
		sing();
		
	}
}

public class Solution {
	public static void main(String[] args) {
		Animal bird = new Bird();
		bird.move();
		bird.makeSound();
	}
}