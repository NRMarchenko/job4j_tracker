package ru.job4j.polymorphism;

public class Bus implements  Transport {
    @Override
    public void move() {
        System.out.println("Двигаюсь по маршруту к следующей остановке");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Автобус вмещает в себя " + count + " пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("Заправка обошлась в " + fuel * 45 + " рублей");
        return (fuel * 45);
    }

    public static void main(String[] args) {
        Bus test = new Bus();
        test.move();
        test.passengers(10);
        test.refuel(40);
    }
}
