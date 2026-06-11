package com.goal.miniPharos.domain.book;

import com.goal.miniPharos.domain.book.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "user_id")
    private UUID userId;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String genre;

    @Column
    private Double rate;

    @Column
    private String notes;

    @Column
    @Enumerated(EnumType.STRING)
    private Status status;;

    @Column(name = "created_at",updatable = false)
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column
    private Boolean active = true;
}
