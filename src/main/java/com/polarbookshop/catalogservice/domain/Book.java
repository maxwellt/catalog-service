package com.polarbookshop.catalogservice.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import org.springframework.data.annotation.*;

import java.time.Instant;

public record Book(

        @Id
        Long id,

        @Version
        int version,

        @CreatedDate
        Instant createdDate,

        @CreatedBy
        String createdBy,

        @LastModifiedDate
        Instant lastModifiedDate,

        @LastModifiedBy
        String lastModifiedBy,

        @NotBlank(message = "The book ISBN must be defined")
        @Pattern(
                regexp = "^([0-9]{10}|[0-9]{13})$",
                message = "The ISBN format must be valid"
        )
        String isbn,

        @NotBlank(message = "The book title must be defined")
        String title,

        @NotBlank(message = "The book author must be defined")
        String author,

        @NotNull(message = "The book price must be defined")
        @Positive(message = "The book price must be greater than zero")
        Double price,

        String publisher
) {
    public static Book of(String isbn, String title, String author, Double price) {
        return Book.of(isbn, title, author, price, null);
    }

    public static Book of(String isbn, String title, String author, Double price, String publisher) {
        return new Book(null, 0, null, null, null, null, isbn, title, author, price, publisher);
    }
}
