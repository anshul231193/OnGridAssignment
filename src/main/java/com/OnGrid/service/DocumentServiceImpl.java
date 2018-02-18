package com.OnGrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnGrid.dao.DocumentDAO;
import com.OnGrid.model.Document;
import com.OnGrid.model.Type;

@Service
@Transactional
public class DocumentServiceImpl implements DocumentService{

	@Autowired
	private DocumentDAO docRepository;
	
	@Override
	public Document findByDocNumber(String docNumber) {
		// TODO Auto-generated method stub
		return docRepository.findByDocNumber(docNumber);
	}

	@Override
	public Document findByType(Type type) {
		// TODO Auto-generated method stub
		return docRepository.findByTypes(type);
	}

	@Override
	public Page<Document> findAllByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return docRepository.findAll(pageable);
	}

	@Override
	public Document findOne(long id) {
		// TODO Auto-generated method stub
		return docRepository.getOne(id);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		docRepository.deleteById(id);
	}

	@Override
	public List<Document> findAll() {
		// TODO Auto-generated method stub
		return docRepository.findAll();
	}

	@Override
	public void saveOrUpdate(Document document) {
		// TODO Auto-generated method stub
		docRepository.save(document);
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return docRepository.count();
	}

	@Override
	public Document findByTypesAndDocNumber(Type type, String docNumber) {
		// TODO Auto-generated method stub
		return docRepository.findByTypesAndDocNumber(type, docNumber);
	}

}
