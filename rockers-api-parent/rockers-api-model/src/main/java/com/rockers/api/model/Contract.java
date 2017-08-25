package com.rockers.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Contract extends BaseEntity {

	
	@Column(name = "name", nullable = false, unique = true)
	private String name;

	
}
