package Sem6;

import java.util.ArrayList;

// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.

public class Cat {
    private int weight;
    private int age;
    private String name;
    private String color;
    private String ownerAdress;
    private boolean isSpeak;

    public Cat(int weight, int age, String name, String color, String adress) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.name = name;
        this.ownerAdress = adress;
        // ArrayList<String> list = new Cat<>(weight, age, name, color, adress);
    }  

    public void setIsSpeak(boolean isSpeak) {
        this.isSpeak = isSpeak;
    }

    public void eat(){
        System.out.println("Кот ест");
    }

    public void sleep(){
        System.out.println("Кот спит");
    }

    public void speak(){
       if(isSpeak) {
        System.out.println("Кот орет");
       } else {
        System.out.println("Кот вежливо и учтиво мяукает");
       }
    }
    
    public void weightCat(){
        System.out.println(weight);
    }


    public void descrition(){
        System.out.println("Что умеет кот: ");
        sleep();
        eat();
        speak();
    }

    public void printInfo() {
        System.out.printf("У кота %s возраст: %d, цвет: %s, вес: %s, а хозяин живет: %s\n", name, age, color, weight, ownerAdress );
    }

}
