package OOP.DZ_to_Sem1.ex3;

import OOP.DZ_to_Sem1.ex2.TV;

import java.util.Random;

public class Human3 {
    private int strength;
    private String name;
    public Human3(String name) {
        this.name = name;
        this.strength = 100;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
