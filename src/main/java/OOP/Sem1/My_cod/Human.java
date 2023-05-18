package OOP.Sem1.My_cod;

public class Human {

    private int weight;
    private int age;
    private String name;
    private String adres;
    private String male;


    public Human(int weight, int age, String name, String adres, String male) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.adres = adres;
        this.male = male;
    }

    public void speak(){
        System.out.println("Человек разговаривает");
    }

    public void sleep(){
        System.out.println("Человек разговаривает");
    }

    public void descrition(){
        System.out.println("Навыки: ");
        sleep();
        speak();
    }

    public void printInfo() {
        System.out.printf("Человека зовут: %s, его возраст: %d, вес: %s, проживает по адресу: %s, его пол: %s\n", name, age, weight, adres, male);
    }



}
