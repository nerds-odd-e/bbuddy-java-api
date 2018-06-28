package com.odde.bbuddy.repository;

import com.odde.bbuddy.domain.Accounts;
import com.odde.bbuddy.validator.Unique;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@Table(
        uniqueConstraints = @UniqueConstraint(columnNames = {"name"})
)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
//    @Unique(fieldCheck = Accounts.class)
    @NonNull
    private String name;

    @Min(0)
    @NonNull
    private Integer balance;
}
