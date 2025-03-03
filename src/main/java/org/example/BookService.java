package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BookService {
    private final List<Book> books = new ArrayList<>();
    private final Map<String, Integer> categoryCount = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
        categoryCount.put(book.getCategory(), categoryCount.getOrDefault(book.getCategory(), 0) + 1);
    }

    public void updateBook(int index, Book book) {
        if (index >= 0 && index < books.size()) {
            Book oldBook = books.get(index);
            categoryCount.put(oldBook.getCategory(), categoryCount.get(oldBook.getCategory()) - 1);
            books.set(index, book);
            categoryCount.put(book.getCategory(), categoryCount.getOrDefault(book.getCategory(), 0) + 1);
        }
    }

    public void deleteBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book book = books.remove(index);
            categoryCount.put(book.getCategory(), categoryCount.get(book.getCategory()) - 1);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public Map<String, Integer> getCategorySummary() {
        return categoryCount;
    }
}
