package ru.job4j.oop;

public class JukeBox {
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        JukeBox juke = new JukeBox();
        for (int i = 0; i < 3; i++) {
            juke.music(i);
        }
    }
}
