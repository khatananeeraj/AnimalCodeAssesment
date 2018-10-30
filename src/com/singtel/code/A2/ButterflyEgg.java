package com.singtel.code.A2;

public class ButterflyEgg extends Butterfly implements AnimalState {

	@Override
	public String move() {
		return "cannot move";
	}

	@Override
	public String living() {
		this.setName("ButterflyEgg");
		return "Butterfly is in " + this.getName() + " state.";
	}

}
