package OOP.Sem1.Peter;

public class Human {

    private String name;
    private String sex;
    private boolean liveStatus;

    private Human spouse; // супруг(а)

// Конструктор Адама
    public Human(String name, String sex, boolean liveStatus) {
        this.name = name;
        this.sex = sex;
        this.liveStatus = liveStatus;
        this.spouse = spouse;
    }


    public Human(String name, String sex, boolean liveStatus, Human spouse) {
        this.name = name;
        this.sex = sex;
        this.liveStatus = liveStatus;
        this.spouse = spouse;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public boolean isLiveStatus() {
        return liveStatus;
    }

    public Human getSpouse() {
        return spouse;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", liveStatus=" + liveStatus +
                '}';
    }
}
