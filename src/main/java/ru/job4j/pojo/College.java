package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Nikita Marchenko");
        student.setGroup("NR101");
        student.setEntrance(new Date());

        System.out.println(student.getFullName() + " from group: " + student.getGroup() + " : " + student.getEntrance());
    }
}
