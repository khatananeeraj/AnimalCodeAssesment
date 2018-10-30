package com.singtel.code.A2;

public class ButterflyCaterPillar extends Butterfly implements AnimalState {

	@Override
	public String move() {
		return "can crawl";
	}

	@Override
	public String living() {
		this.setName("CaterPillar");
		return "Butterfly is in CaterPillar State.";
	}

}
