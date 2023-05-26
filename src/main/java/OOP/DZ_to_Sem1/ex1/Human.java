package OOP.DZ_to_Sem1.ex1;

public class Human {
    Integer id;
    String name;
    String sex;
    Human spouse;

    public Human(Integer id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Integer getID() {
        return id;
    }
    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        String human = "\n====================================" +
                "\nID:            \t" + id +
                "\nИмя:           \t" + name +
                "\nПол:           \t" + sex;
        return human;
    }
}
