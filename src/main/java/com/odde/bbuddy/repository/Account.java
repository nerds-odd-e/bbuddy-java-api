package com.odde.bbuddy.repository;

import com.odde.bbuddy.domain.Accounts;
import com.odde.bbuddy.validator.Unique;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(
        uniqueConstraints = @UniqueConstraint(columnNames = {"name"})
)
public class Account {
    @Id
    @GeneratedValue
    private long id;

    @NotBlank
//    @Unique(fieldCheck = Accounts.class)
    private String name;

    @NotNull
    @Min(0)
    private Integer balance;
}
