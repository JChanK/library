package com.example.linfe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    // GET endpoint with Query Parameters
    @GetMapping("/books")
    public String getBooksByAuthor(@RequestParam(required = false) String author) {
        if (author == null || author.isEmpty()) {
            return "{\"message\": \"Please provide an author name as a query parameter.\"}";
        }
        return "{\"message\": \"Books by " + author + "\"}";
    }

    /**
     * GET endpoint with Path Parameters.
    */
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "{\"message\": \"Book with ID " + id + "\"}";
    }
}