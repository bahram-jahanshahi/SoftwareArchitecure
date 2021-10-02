package se.bahram.softwarearchitecture.test.architecture.archtest.archtestspringboothelloworld.repository;

import org.springframework.stereotype.Component;
import se.bahram.softwarearchitecture.test.architecture.archtest.archtestspringboothelloworld.domain.Book;

import java.util.HashMap;
import java.util.HashSet;

@Component
public class BookRepository {

    HashMap books = new HashMap<Integer, Book>();

    public Book save(Book book) {
        book.setId((int) Math.random() * 100000);
        books.put(book.getId(), book);

        return book;
    }
}
