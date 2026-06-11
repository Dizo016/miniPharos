package com.goal.miniPharos.domain.book;

import com.goal.miniPharos.domain.book.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    private UUID id;
    private UUID userId;
    private String title;
    private String author;
    private String genre;
    private Double rate;
    private String notes;
    private Status status;;
}
