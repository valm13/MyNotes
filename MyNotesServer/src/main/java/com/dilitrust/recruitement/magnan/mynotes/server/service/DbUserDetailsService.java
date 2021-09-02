package com.dilitrust.recruitement.magnan.mynotes.server.service;

import com.dilitrust.recruitement.magnan.mynotes.server.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DbUserDetailsService implements UserDetailsService {

	@Autowired
	private AccountRepository accounts;
	
	public UserDetails loadUserByUsername(String login) {
		UserDetails user = accounts.findByUsername(login);
		if(user == null)
			throw new UsernameNotFoundException(login);
		return user;
	}

}
