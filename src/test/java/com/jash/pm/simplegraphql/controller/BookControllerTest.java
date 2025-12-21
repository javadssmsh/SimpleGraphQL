package com.jash.pm.simplegraphql.controller;

import com.jash.pm.simplegraphql.dto.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.graphql.test.autoconfigure.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest
class BookControllerTest {

    @Autowired
    private GraphQlTester graphQlTester;


    @Test
    void canGetBooks() {
        graphQlTester.documentName("books")
                .execute()
                .path("books")
                .entityList(Book.class)
                .hasSize(4);
    }
}