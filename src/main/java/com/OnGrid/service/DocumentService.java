package com.OnGrid.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.OnGrid.model.Document;
import com.OnGrid.model.Type;


public interface DocumentService {
	
	Document findByDocNumber(String docNumber);
	
	Document findByType(Type type);
	
	Document findByTypesAndDocNumber(Type type,String docNumber);

    Page<Document> findAllByPage(Pageable pageable);

    Document findOne(long id);

    void delete(long id);

    List<Document> findAll();

    void saveOrUpdate(Document document);

    Long count();

}
