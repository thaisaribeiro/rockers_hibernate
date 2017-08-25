package com.rockers.api.model;

import java.util.HashSet;
import lombok.Data;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Team extends BaseEntity {
	
	@Column(name = "name", nullable = false, unique = true)
	private String name;
	
	
	
	
} 