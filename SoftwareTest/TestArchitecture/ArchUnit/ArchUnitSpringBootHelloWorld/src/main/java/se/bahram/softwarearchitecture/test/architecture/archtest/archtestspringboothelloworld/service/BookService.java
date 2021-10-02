package se.bahram.softwarearchitecture.test.architecture.archtest.archtestspringboothelloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.bahram.softwarearchitecture.test.architecture.archtest.archtestspringboothelloworld.domain.Book;
import se.bahram.softwarearchitecture.test.architecture.archtest.archtestspringboothelloworld.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book addNewBookToBookStore(String title, String isbn, int bookStoreId) {

        return this.bookRepository.save(
                new Book(0, title, isbn, bookStoreId)
        );
    }
}
