package com.mycompany.testbook; // Change this package name to match your NetBeans project if needed

// Additional class for Book
class Book {
    String title;
    String author;
    double price;

    void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}

// Main Public Class
public class TestBook {
    public static void main(String[] args) {
        // Create one object of Book
        Book b1 = new Book();
        
        b1.title = "Harry Potter";
        b1.author = "J.K. Rowling";
        b1.price = 2500.00;
        
        // Display details
        b1.displayBookDetails();
    }
}