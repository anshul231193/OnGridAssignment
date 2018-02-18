package com.OnGrid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.OnGrid.model.*;

@Repository
@Transactional
public interface DocumentDAO extends JpaRepository<Document,Long>{
	
	Document findByDocNumber(String docNumber);
	
	Document findByTypes(Type type);
	
	Document findByTypesAndDocNumber(Type type,String docNumber);
	
	void deleteByDocNumber(String docNumber);

}
