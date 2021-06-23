package com.subrutin.catalog.service.impl;

import com.subrutin.catalog.form.BookForm;
import com.subrutin.catalog.model.Book;
import com.subrutin.catalog.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookService {

    List<Book> books = new ArrayList<>();

    public BookServiceImpl() {
        Book book1 = new Book();
        book1.setId("1");
        book1.setTitle("Java OOP");
        book1.setAuthor("Edho Dwi Tirwanda");
        book1.setDescription("Belajar java MVC + Spring boot");

        Book book2 = new Book();
        book2.setId("1");
        book2.setTitle("Java Standard Classes");
        book2.setAuthor("Edho Dwi Tirwanda");
        book2.setDescription("Belajar java Part 2");

        books.add(book1);
        books.add(book2);
    }

    @Override
    public List<Book> findBookAll() {
        return books;
    }

    @Override
    public void createNewBook(BookForm bookForm) {
        Book book = new Book();
        book.setTitle(bookForm.getTitle());
        book.setAuthor(bookForm.getAuthor());
        book.setDescription(bookForm.getDescription());
        book.setId(UUID.randomUUID().toString());

        books.add(book);
    }
}
