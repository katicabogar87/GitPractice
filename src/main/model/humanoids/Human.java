package main.model.humanoids;

import main.model.Gender;

import java.time.LocalDate;

public class Human extends Humanoid {

    private Gender gender;

<<<<<<< HEAD
    public Human(String lastName, String firstName, LocalDate birth, Gender gender) {
        super(lastName, firstName, birth);
        this.gender = gender;
    }

=======
>>>>>>> 36e3a7c72756e5164b5ac7cd0b87608d9027d876
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
