package OOP.DZ_to_Sem1.ex2;

import java.util.Random;
public class Human2 {
    public int strength;
    private final String name;
    public void turnOnOffTV(TV tv) {
        System.out.println();
        System.out.printf("На включение и выключение ТВ %s постоянно тратит разное количество единиц энергии\n", this.name);
        System.out.printf("Силы %s покидают, когда осталось 5 и меньше единиц энергии\n", this.name);
        System.out.println();
        Random random = new Random();
        int decrease = 0;
        for (int i = 0; i < 24; i++) {
            if (this.strength > decrease && this.strength > 5 && !tv.isOn()) {
                decrease = random.nextInt(1, 10);
                this.strength -= decrease;
                System.out.printf("На включение ТВ потрачено %d единиц энергии", decrease);
                System.out.println(" У " + this.name + " осталось " + this.strength + " единиц энергии");
                tv.setOn(true);
                System.out.println("Телевизор включен");
            } else if (this.strength > decrease && this.strength > 5 && tv.isOn()) {
                decrease = random.nextInt(1, 10);
                this.strength -= decrease;
                System.out.printf("На выключение ТВ потрачено %d единиц энергии", decrease);
                System.out.println(" У " + this.name + " осталось " + this.strength + " единиц энергии");
                tv.setOn(false);
                System.out.println("Телевизор выключен");
            } else if (this.strength < decrease && this.strength > 5 && !tv.isOn()) {
                System.out.println();
                System.out.printf("%s, ты пытаешься предпринять усилий больше, чем у тебя сил, пора спать!\n", this.name);
                break;
            } else if (this.strength < decrease && this.strength > 5 && tv.isOn()) {
                System.out.println();
                System.out.printf("%s, ты пытаешься предпринять усилий больше, чем у тебя сил, пора спать!\n", this.name);
                break;
            } else {
                System.out.println();
                System.out.println("Ничего не выйдет, сил не осталось - пора спать!");
                break;
            }
        }
    }
    public void gotoSleep() {
        System.out.println();
        System.out.println(this.name + " лег спать");
        System.out.println("Силы восстановлены");
        strength = 100;
    }
    public Human2(String name) {
        this.name = name;
        this.strength = 100;
    }
}
