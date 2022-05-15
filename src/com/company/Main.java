package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 6 и 7
        Author authorEng = new Author("Joanne", "Rowling");
        Author authorRus = new Author("Джоан", "Роулинг");
        Book book1 = new Book("Philosopher's Stone", 1997, authorEng);
        Book book2 = new Book("Chamber of Secrets", 1998, authorRus);

        book2.setYear(2000);

        System.out.println(book2.getYear()); //Проверка
    }
}
