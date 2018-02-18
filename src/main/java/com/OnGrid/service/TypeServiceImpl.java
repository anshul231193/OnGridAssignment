package com.OnGrid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnGrid.dao.TypeDAO;
import com.OnGrid.model.Type;

@Service
@Transactional
public class TypeServiceImpl implements TypeService{

	@Autowired
	private TypeDAO typeRepository;
	
	@Override
	public Type findType(long id) {
		// TODO Auto-generated method stub
		return typeRepository.getOne(id);
	}

	@Override
	public Type findByName(String name) {
		// TODO Auto-generated method stub
		return typeRepository.findByName(name);
	}
	

}
