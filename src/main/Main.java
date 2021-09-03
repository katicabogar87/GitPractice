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

        Human human1 = new Human("Gergely", "Lorincz", LocalDate.parse("1985-12-29"), Gender.MALE);

        Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Parrot parrot = new Parrot();

        human1.getPetsOwned().add(animal);
        human1.getPetsOwned().add(dog);
        human1.getPetsOwned().add(cat);
        human1.getPetsOwned().add(parrot);


        Human human2 = new Human("Kata", "Antal", LocalDate.parse("1987.08.11"), Gender.FEMALE);
        Dog kutyuli = new Dog();
        Cat morcos = new Cat();
        Parrot pirate = new Parrot();

        human2.getPetsOwned().add(kutyuli);
        human2.getPetsOwned().add(morcos);
        human2.getPetsOwned().add(pirate);
    }

}

