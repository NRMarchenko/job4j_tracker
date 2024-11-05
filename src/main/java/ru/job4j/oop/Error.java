package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Состояние: " + active);
        System.out.println("Код ошибки: " + status);
        System.out.println("Текст сообщения: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error2 = new Error(true, 404, "Страница не найдена");
        error2.printInfo();
        Error error3 = new Error(true, 256, "Критическая ошибка");
        error3.printInfo();
    }
}
