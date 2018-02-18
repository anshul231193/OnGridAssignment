package com.OnGrid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.OnGrid.model.Type;

@Repository
@Transactional
public interface TypeDAO extends JpaRepository<Type, Long>{
	
	Type findByName(String name);

}
