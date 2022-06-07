package com.odde.bbuddy.repository;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(
        uniqueConstraints = @UniqueConstraint(columnNames = {"name"})
)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @NonNull
    private String name;

    @Min(0)
    @NonNull
    private Integer balance;
}
