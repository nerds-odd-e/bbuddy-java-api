package com.odde.bbuddy.repository;

import com.odde.bbuddy.domain.Accounts;
import com.odde.bbuddy.validator.Unique;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Unique(fieldCheck = Accounts.class)
    @NonNull
    private String name;

    @Min(0)
    @NonNull
    private long balance;
}
