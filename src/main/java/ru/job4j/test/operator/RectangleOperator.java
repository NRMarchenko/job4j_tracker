package ru.job4j.test.operator;

import ru.job4j.test.shape.Rectangle;
import ru.job4j.test.shape.Shape;

import java.util.Scanner;

public class RectangleOperator extends ShapeOperator {

    private Scanner input = new Scanner(System.in);

    @Override
    public Shape createShape() {
        System.out.print("Введите ширину прямоугольника: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Введите длину прямоугольника: ");
        int b = Integer.parseInt(input.nextLine());
        return new Rectangle(a, b);
    }
}