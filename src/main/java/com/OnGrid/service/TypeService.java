package com.OnGrid.service;

import com.OnGrid.model.Type;

public interface TypeService {
	
	Type findType(long id);
	
	Type findByName(String name);

}
