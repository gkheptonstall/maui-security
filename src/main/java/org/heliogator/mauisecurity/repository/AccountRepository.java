package org.heliogator.mauisecurity.repository;

import java.util.Optional;

import org.heliogator.mauisecurity.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUserName(String userName);
}
