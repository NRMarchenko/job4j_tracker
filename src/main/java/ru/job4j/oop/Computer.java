package ru.job4j.oop;

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }
/*
    Конструктор с 2 параметрами.
 */

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }
    /*
    Конструктор с измененным типом данных который подается на вход.
     */

    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer first = new Computer(true, 500, "Intel Core I7-10700K");
        first.printInfo();
        Computer second = new Computer(true, 256, "AMD Ryzen 5 3600");
        second.printInfo();
        Computer computerdef = new Computer();
        computerdef.printInfo();
        Computer third = new Computer(256, "AMD Ryzen 5 3600");
        third.printInfo();
        Computer forth = new Computer(true, 512, "AMD Ryzen 7 3700X");
        forth.printInfo();
    }
}