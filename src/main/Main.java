package main;

<<<<<<< HEAD
import main.model.Gender;
import main.model.animals.Animal;
=======
>>>>>>> f5ae387e96874feca93381c855a81221432a0e50
import main.model.animals.Cat;
import main.model.animals.Dog;
import main.model.animals.Parrot;
import main.model.humanoids.Human;
<<<<<<< HEAD

import java.time.LocalDate;

=======
import main.model.humanoids.Humanoid;

import java.nio.channels.Pipe;
import java.time.LocalDate;

import static main.model.Gender.FEMALE;

>>>>>>> f5ae387e96874feca93381c855a81221432a0e50
public class Main {

    public static void main(String[] args) {

<<<<<<< HEAD

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
=======
        Human human = new Human("Kata", "Antal", LocalDate.parse("1987.08.11"), FEMALE);


        Dog kutyuli = new Dog();
        Cat morcos = new Cat();
        Parrot pirate = new Parrot();

        human.getPetsOwned().add(kutyuli);
        human.getPetsOwned().add(morcos);
        human.getPetsOwned().add(pirate);
    }

}
>>>>>>> f5ae387e96874feca93381c855a81221432a0e50
