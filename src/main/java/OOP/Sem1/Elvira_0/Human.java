package OOP.Sem1.Elvira_0;

public class Human {
    private String name;
    private String sex;
    private boolean liveStatus;
    private Human father;
    private Human mother;
    private Human next;

    public Human(String name, String sex, boolean liveStatus, Human father, Human mother, Human next) {
        this.name = name;
        this.sex = sex;
        this.liveStatus = liveStatus;
        this.father = father;
        this.mother = mother;
        this.next = next;
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

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Human getNext() {
        return next;
    }

    public Human(String name, String sex, boolean liveStatus) {
        this.name = name;
        this.sex = sex;
        this.liveStatus = liveStatus;
    }

    public void setNext(Human human) {
        this.next = human;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", liveStatus=" + liveStatus +
                ", father=" + father +
                ", mother=" + mother +
                '}';
    }
}