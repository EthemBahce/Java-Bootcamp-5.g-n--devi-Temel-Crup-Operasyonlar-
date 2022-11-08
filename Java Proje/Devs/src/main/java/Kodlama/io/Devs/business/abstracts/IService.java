package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.concretes.request.CreateLanguageRequest;
import Kodlama.io.Devs.business.concretes.responses.GetAllLanguageResponses;

/*
import java.util.List;

import Kodlama.io.Devs.entities.Language;*/

public interface IService {
	
	List<GetAllLanguageResponses> getAll();
	void add(CreateLanguageRequest createLanguageRequest);
	void update(int id, CreateLanguageRequest createLanguageRequest);
	void delete(int id);
	
	
	
	
	
	


}
