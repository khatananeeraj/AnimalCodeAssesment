package com.singtel.code.A2;

public class ButterflyContext {
	private AnimalState animalState;
	
    public AnimalState getState() {
    	return animalState;
    }
    public void setState(AnimalState state) {
    	animalState = state; 
    }
    public String currentState() {
    	return animalState.living();
    }
}
