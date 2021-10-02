package se.bahram.softwarearchitecture.test.architecture.archtest.archtestspringboothelloworld.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {

    private int id;

    private String title;

    private String isbn;

    private int bookStoreId;
}
