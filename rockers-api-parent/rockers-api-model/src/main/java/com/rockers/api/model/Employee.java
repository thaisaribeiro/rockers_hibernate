package com.rockers.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Employee extends BaseEntity {
	
	@Column(name = "name", nullable = false, unique = true)
	private String name;
	
	@Column(name = "wipro_id")
	private String WiproId;
	
	@Column(name = "client_id")
	private int idCliente;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "password")
	private String password;
} 
