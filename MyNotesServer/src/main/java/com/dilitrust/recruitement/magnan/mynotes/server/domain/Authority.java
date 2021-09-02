package com.dilitrust.recruitement.magnan.mynotes.server.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "authority")
public class Authority implements GrantedAuthority {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6244318455911809051L;

	@Id @Column
	@GeneratedValue
	private Long id;
	
	private String authority;
}
