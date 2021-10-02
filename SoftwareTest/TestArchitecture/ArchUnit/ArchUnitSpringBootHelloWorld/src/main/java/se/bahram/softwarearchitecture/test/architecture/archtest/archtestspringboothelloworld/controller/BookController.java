package se.bahram.softwarearchitecture.test.architecture.archtest.archtestspringboothelloworld.controller;

import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.bahram.softwarearchitecture.test.architecture.archtest.archtestspringboothelloworld.domain.Book;
import se.bahram.softwarearchitecture.test.architecture.archtest.archtestspringboothelloworld.repository.BookRepository;
import se.bahram.softwarearchitecture.test.architecture.archtest.archtestspringboothelloworld.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

    /*
     @Autowired
     private BookRepository bookRepository;
    */

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping()
    public Book addNewBookToBookStore(@RequestBody AddNewBookCommand command) {
        return bookService.addNewBookToBookStore(command.getTitle(), command.getIsbn(), command.bookStoreId);
    }

    @Value
    private class AddNewBookCommand {
        private int id;
        private String title;
        private String isbn;
        private int bookStoreId;
    }
}
