package org.example;

class Book {
    private String title;
    private String author;
    private String category;
    private int publicationYear;

    public Book(String title, String author, String category, int publicationYear) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.publicationYear = publicationYear;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category.toLowerCase(); }
    public int getPublicationYear() { return publicationYear; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setCategory(String category) { this.category = category; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
}

