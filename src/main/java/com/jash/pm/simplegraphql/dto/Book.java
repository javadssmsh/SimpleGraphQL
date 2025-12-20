package com.jash.pm.simplegraphql.dto;

import java.util.Arrays;
import java.util.List;

public record Book(
        Integer id,
        String name,
        Integer pageCount
) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "javad", 600),
            new Book(2, "javad shir", 700),
            new Book(3, "javad new", 800),
            new Book(4, "javad end", 500)
    );

    public static Book getBookById(Integer id) {
        return books.stream().filter(book -> book.id.equals(id)).findFirst().orElse(null);
    }
}
