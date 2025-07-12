package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get bean and call method
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.addBook("Effective Java");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
