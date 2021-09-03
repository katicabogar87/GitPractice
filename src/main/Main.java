package main;

import main.model.animals.Cat;
import main.model.animals.Dog;
import main.model.animals.Parrot;
import main.model.humanoids.Human;
import main.model.humanoids.Humanoid;

import java.nio.channels.Pipe;
import java.time.LocalDate;

import static main.model.Gender.FEMALE;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Kata", "Antal", LocalDate.parse("1987.08.11"), FEMALE);


        Dog kutyuli = new Dog();
        Cat morcos = new Cat();
        Parrot pirate = new Parrot();

        human.getPetsOwned().add(kutyuli);
        human.getPetsOwned().add(morcos);
        human.getPetsOwned().add(pirate);
    }

}
