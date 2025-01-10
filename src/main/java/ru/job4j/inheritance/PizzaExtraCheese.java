package ru.job4j.inheritance;
//Не могу разобраться с коммитами
public class PizzaExtraCheese extends Pizza {
@Override
    public String name() {
        return super.name() + " + extra cheese";
    }
}
