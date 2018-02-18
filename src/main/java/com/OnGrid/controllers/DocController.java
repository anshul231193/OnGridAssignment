package com.OnGrid.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnGrid.model.Document;
import com.OnGrid.model.Type;
import com.OnGrid.service.DocumentService;
import com.OnGrid.service.TypeService;


@RestController
public class DocController {
	
	
	private final DocumentService docService;
    private final TypeService typeService;

    @Autowired
    public DocController(DocumentService docService, TypeService typeService) {
        this.docService = docService;
        this.typeService = typeService;
    }

    @PostMapping("/register")
	@ResponseBody
    public String register(Document document,String type){
    	try{
    		Type docType = typeService.findByName(type.toLowerCase());
    		document.setTypes(docType);
    		docService.saveOrUpdate(document);
    	}catch(Exception e){
    		e.printStackTrace();
    		return "Registeration Failure";
    	}
    	
    	return "Registeration Successful";
    }
    
    @GetMapping("/getAllDocs")
    @ResponseBody
    public List<Document> getAllDocuments(){
    	return docService.findAll();
    }
    
    @GetMapping("/getDocByTypeAndNumber")
    @ResponseBody
    public Document getDocumentByNumberAndType(String type, String docNumber){
    	try{
    		Type docType = typeService.findByName(type.toLowerCase());
    		return docService.findByTypesAndDocNumber(docType, docNumber);
    	}catch(Exception e){
    		e.printStackTrace();
    		return null;
    	}
    }
    
    @PostMapping("/deleteDoc")
    @ResponseBody
    public String deleteDocument(String id){
    	try{
    		docService.delete(Long.parseLong(id));
    	}catch(Exception e){
    		e.printStackTrace();
    		return "Error in Delete Operation";
    	}
    	return "Succesfully Deleted";
    }
    
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome(Map<String, Object> model) {
		model.put("message", "Hello World!!");
		return "welcome";
	}

}
