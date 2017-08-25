package org.rockers.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockers.api.model.Contract;

public interface ContractRepository  extends JpaRepository<Contract, Long>{
	
}
