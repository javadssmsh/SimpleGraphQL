package com.jash.pm.simplegraphql.dto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(
        Integer id ,
        String name
) {

    public static List<Author> authors = Arrays.asList(
            new Author(1,"auth 1"),
            new Author(2,"auth 2")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream().filter(book -> book.id.equals(id)).findFirst();
    }
}
