package com.dilitrust.recruitement.magnan.mynotes.server.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "account")
public class Account implements UserDetails{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6407893062337433670L;

	@Id @Column
	@GeneratedValue
	private Long id;
	
	@Column(length = 100)
	private String username;
	
	@Column(length = 100)
	private String password;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private Collection<Authority> authorities;

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}