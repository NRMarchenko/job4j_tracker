package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
       /* Item first = new Item();
        LocalDateTime time = first.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println("Текущая дата: " + time.format(formatter));*/
        int a = 8;
        int b = 3;
        int result = 0;
        int length = 1;
        int section = 1;
        int sum = 0;
        int num = 1234;
       /* for (int i = a; i <= b; i = i + 2) {
            if (i % 2 == 1) {
                result++;
            }
        }*/

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
