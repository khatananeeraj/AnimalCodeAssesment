package com.singtel.code.A2;

public class Shark extends Fish {
	public Shark() {
		this.setName("Shark");
	}
	public String getFeature() {
		return "large and grey";
	}
	public String getFood() {
		return "eat other fish";
	}
	@Override
	public <T> T acceptVisitor(AnimalVisitor<T> visitor) {
		return visitor.visitShark(this);
	}

}
