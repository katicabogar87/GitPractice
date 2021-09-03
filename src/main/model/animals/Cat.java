package main.model.animals;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("miau");
    }

    @Override
    public void play() {
        System.out.println("chasing a mouse");
    }

}
