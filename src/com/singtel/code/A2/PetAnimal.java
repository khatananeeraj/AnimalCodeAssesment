package com.singtel.code.A2;

public class PetAnimal implements AnimalVisitor<String> {

	@Override
	public String visitDuck(Duck duck) {
		String str = "Duck "+ duck.move() + " and says "+ duck.makeSound();
		return str;
	}

	@Override
	public String visitChicken(Chicken chicken) {
		String str = "Chicken "+ chicken.move() + " and says "+ chicken.makeSound();
		return str;
	}

	@Override
	public String visitBird(Bird bird) {
		String str = "Bird "+ bird.move() + " and "+ bird.makeSound();
		return str;
	}

	public static String get(Animal animal) {
		PetAnimal visitor = new PetAnimal();
	    return animal.acceptVisitor(visitor);
	  }

	@Override
	public String visitRooster(Rooster rooster) {
		String str = "Rooster "+ rooster.move() + " and says "+ rooster.makeSound();
		return str;
	}

	@Override
	public String visitDog(Dog dog) {
		String str = "Rooster "+ dog.move() + " and says "+ dog.makeSound();
		return str;
	}

	@Override
	public String visitCat(Cat cat) {
		String str = "Rooster "+ cat.move() + " and says "+ cat.makeSound();
		return str;
	}

	@Override
	public String visitParrot(Parrot parrot) {
		String str = "Parrot "+ parrot.move() + " and says "+ parrot.makeSound();
		return str;
	}

	@Override
	public String visitFish(Fish fish) {
		String str = fish.getName() + " "+ fish.move() + " and "+ fish.makeSound();
		return str;
	}

	@Override
	public String visitShark(Shark shark) {
		String str = shark.getName() + " " + shark.move() + " and "+ shark.makeSound() + ".";
		str = str + "They are " + shark.getFeature() + " and " + shark.getFood();
		return str;
	}

	@Override
	public String visitClownFish(ClownFish clownFish) {
		String str = clownFish.getName() + " " + clownFish.move() + " and "+ clownFish.makeSound() + ".";
		str = str + "They are " + clownFish.getFeature();
		return str;
	}

	@Override
	public String visitDolphin(Dolphin dolphin) {
		String str = "Dolphin " + dolphin.move() + " and "+ dolphin.makeSound() + ".";
		return str;
	}

	@Override
	public String visitButterfly(Butterfly butterfly) {
		String str = butterfly.living() + " It " + butterfly.move() + " and "+ butterfly.makeSound() + ".";
		
		return str;
	}
}
