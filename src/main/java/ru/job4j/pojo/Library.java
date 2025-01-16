package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book comedy = new Book("Трое в лодке, не считая собаки", 250);
        Book code = new Book("Clean code", 1000);
        Book drama = new Book("Отцы и дети", 500);
        Book fantasy = new Book("Ведьмак", 320);
        Book[] books = new Book[4];
        books[0] = comedy;
        books[1] = code;
        books[2] = drama;
        books[3] = fantasy;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPageCount());
        }
        System.out.println("Swap books.");
        books[0] = fantasy;
        books[3] = comedy;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPageCount());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.equals(books[1])) {
                System.out.println(book.getName() + " - " + book.getPageCount());
            }
        }
    }
}
