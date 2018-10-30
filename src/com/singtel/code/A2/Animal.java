package com.singtel.code.A2;

public interface Animal {
	String move();
	String makeSound();
	<T> T acceptVisitor(AnimalVisitor<T> visitor);
}
