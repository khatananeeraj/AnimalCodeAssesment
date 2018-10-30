package com.singtel.code.A2;

import java.util.Map;

// Model a rooster without using inheriting Chicken
public class Rooster implements Animal {

	
	public String move() {
		return new Chicken().move();
	}
	
	public String makeSound() {
		return "Cock-a-doodle-doo";
	}
	public String makeSound(String countryName) {
		Map<String, String> soundMap = new RoosterSound().getRoosterMap();
		return soundMap.get(countryName);
	}
	
	public <T> T acceptVisitor(AnimalVisitor<T> visitor) {
		return visitor.visitRooster(this);
		
	}

}
