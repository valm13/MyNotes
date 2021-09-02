package com.dilitrust.recruitement.magnan.mynotes.server.repository;


import com.dilitrust.recruitement.magnan.mynotes.server.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
	public Account findByUsername(String username);

}
