package main.model.humanoids;

import main.model.animals.Animal;

public class Elf extends Humanoid{


    @Override
    public void renamePet(Animal animal, String newName) {
        animal.setName("my Beloved" + newName);
    }
}
