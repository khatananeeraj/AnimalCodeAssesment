package com.singtel.code.A2;

public class Solution {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[]{new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(), new Fish(), new Shark(), new ClownFish(), new Dolphin(), new Butterfly()};
		for(Animal animal : animals)
		System.out.println(PetAnimal.get(animal));
		
		// model a parrot. One that lives with another animal makes its sound
		// keep the parrot maintainable.
		Parrot parrot = new Parrot();
		parrot.livingWith(new Cat());
		System.out.println(PetAnimal.get(parrot));
		
		// optimize the model to account for the metamorphosis 
		// from caterpillar to butterfly?
		ButterflyContext bContext = new ButterflyContext();
		ButterflyCaterPillar caterPillar = new ButterflyCaterPillar();
		bContext.setState(caterPillar);
		System.out.println(PetAnimal.get(caterPillar));
		
		System.out.println();
		// E. Counting animals
		int flyingAnimals = 0, walkingAnimals = 0, singingAnimals = 0, swimmingAnimals = 0;
		for(Animal animal : animals) {
			if(animal.move().contains("can fly")) {
				flyingAnimals += 1;
			}
			if(animal.move().contains("can walk")) {
				walkingAnimals += 1;
			}
			if(animal.makeSound().contains("can sing")) {
				singingAnimals += 1;
			}
			if(animal.move().contains("can swim")) {
				swimmingAnimals += 1;
			}
		}
		System.out.println("Number of Animals flying are : "+flyingAnimals);
		System.out.println("Number of Animals walking are : "+walkingAnimals);
		System.out.println("Number of Animals singing are : "+singingAnimals);
		System.out.println("Number of Animals swimming are : "+swimmingAnimals);
		
		
	}
}