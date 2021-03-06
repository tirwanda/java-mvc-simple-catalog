package com.subrutin.catalog.service;

import com.subrutin.catalog.form.BookForm;
import com.subrutin.catalog.model.Book;

import java.util.List;

public interface BookService {
    public List<Book> findBookAll();
    public void createNewBook(BookForm bookForm);
}
