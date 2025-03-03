package jml1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=" + price + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Supplier<String> x = String::new;
        BiConsumer<Integer,Integer> y = (a, b) -> System.out.println();
        Function<Integer,Integer> z = a -> a + a;
        List<Book> books = new ArrayList<>();
        books.add(new Book("Effective Java", "Josh", 45.99));
        books.add(new Book("Clean Code", "Aob", 37.99));
        books.add(new Book("Java", "Herb", 55.50));
        books.sort((b1, b2) -> b1.author.compareTo(b2.author));
        books.forEach(System.out::println);
    }
}
