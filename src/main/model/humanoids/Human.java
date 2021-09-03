package main.model.humanoids;

import main.model.Gender;

public class Human extends Humanoid {

    private Gender gender;
 
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
