package main;

import main.model.Gender;
import main.model.animals.Animal;
import main.model.animals.Cat;
import main.model.animals.Dog;
import main.model.animals.Parrot;
import main.model.humanoids.Human;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Human human = new Human("Gergely", "Lorincz", LocalDate.parse("1985-12-29"), Gender.MALE);

        Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Parrot parrot = new Parrot();

    human.getPetsOwned().add(animal);
    human.getPetsOwned().add(dog);
    human.getPetsOwned().add(cat);
    human.getPetsOwned().add(parrot);

    }
}