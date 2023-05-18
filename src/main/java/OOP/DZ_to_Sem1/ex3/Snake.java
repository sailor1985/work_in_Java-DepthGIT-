package OOP.DZ_to_Sem1.ex3;
public class Snake extends Animal {
    @Override
    public void attack(Human3 human) {
        if (human.getStrength() > 5) {
            human.setStrength(human.getStrength() - 5);
            System.out.println("Змея жалит человека по имени " + human.getName());
            System.out.println("У человека по имени " + human.getName() + " осталось " +
                    human.getStrength() + " единиц энергии");
        }
        else System.out.println("Человек по имени " + human.getName() + " погибает или уже погиб");
    }
}
