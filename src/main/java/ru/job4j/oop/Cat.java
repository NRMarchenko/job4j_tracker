package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();

        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.eat("cutlet");
        gav.giveNick("gav");
        gav.show();
        System.out.println("There is black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black");
        black.show();
    }
}