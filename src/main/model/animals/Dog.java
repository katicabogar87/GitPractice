package main.model.animals;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("vau");
    }

    @Override
    public void play() {
        System.out.println("chasing a ball");
    }
}
