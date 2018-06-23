package com.odde.bbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("SELECT CASE WHEN COUNT(account) > 0 THEN 'true' ELSE 'false' END from Account account where account.name = ?1")
    boolean existsByName(String name);
}
