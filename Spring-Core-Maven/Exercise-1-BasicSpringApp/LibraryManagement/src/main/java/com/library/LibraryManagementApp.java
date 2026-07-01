package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApp {

    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean from context
        BookService bookService = context.getBean(BookService.class);

        // Test it
        bookService.addBook("Java Programming");

        System.out.println("Spring Application Context loaded successfully!");
    }
}