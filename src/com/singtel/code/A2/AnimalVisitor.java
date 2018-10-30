package com.singtel.code.A2;

public interface AnimalVisitor<T> {
	T visitDuck(Duck duck);
	T visitChicken(Chicken chicken);
	T visitBird(Bird bird);
	T visitRooster(Rooster rooster);
	T visitDog(Dog dog);
	T visitCat(Cat cat);
	T visitParrot(Parrot parrot);
	T visitFish(Fish fish);
	T visitShark(Shark shark);
	T visitClownFish(ClownFish clownFish);
	T visitDolphin(Dolphin dolphin);
	T visitButterfly(Butterfly butterfly);
}
