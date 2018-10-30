package com.singtel.code.A2;

public class ClownFish extends Fish {
	public ClownFish() {
		this.setName("ClownFish");
	}
	public String getFeature() {
		return " small and colourful (orange)";
	}
	@Override
	public String makeSound() {
		return " make jokes";
	}
	@Override
	public <T> T acceptVisitor(AnimalVisitor<T> visitor) {
		return visitor.visitClownFish(this);
	}

}
