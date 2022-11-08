package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.IService;
import Kodlama.io.Devs.business.concretes.request.CreateLanguageRequest;
import Kodlama.io.Devs.business.concretes.responses.GetAllLanguageResponses;
import Kodlama.io.Devs.dataAccess.abstracts.ILanguageRepository;
import Kodlama.io.Devs.entities.Language;


@Service
public class LanguageServiceManager implements IService{
	
	private ILanguageRepository iRepository;
	
	
	@Autowired
	public LanguageServiceManager(ILanguageRepository iRepository) {
		this.iRepository = iRepository;
		
		
	}


	@Override
	public List<GetAllLanguageResponses> getAll() {
		List<Language> languages = iRepository.findAll();
		List<GetAllLanguageResponses> LanguageResponses = new ArrayList<GetAllLanguageResponses>();
		
		for (Language language : languages) {
			GetAllLanguageResponses responseItem = new GetAllLanguageResponses();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			responseItem.setItems(language.getItems());
			LanguageResponses.add(responseItem);
		}
		
		return LanguageResponses;
	}


	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		language.setId(createLanguageRequest.getId());
		language.setItems(createLanguageRequest.getItems());
		this.iRepository.save(language);
		
		
	}


	@Override
	public void update(int id, CreateLanguageRequest createLanguageRequest) {
		this.iRepository.deleteById(id);
		
		Language language = new Language();
		language.setId(createLanguageRequest.getId());
		language.setName(createLanguageRequest.getName());
		language.setItems(createLanguageRequest.getItems());
		this.iRepository.save(language);
		
	}

    @Override
	public void delete(int id) {
		
    	this.iRepository.deleteById(id);
		
		
	}
	
	
	
	
	
	
	
	


	/*@Override
	public List<Language> getAll() {
		
		return iRepository.getAll();
	}


	@Override
	public Language getId(int index) {
		
		return iRepository.getId(index);
	}


	@Override
	public List<Language> addFunction(int index, String name) {
		
		
		
		return iRepository.addMethods(index, name);
		
		
	}


	


	@Override
	public List<Language> deleteFunction(int index) {
		
		return iRepository.deleteMethods(index);
	}




	@Override
	public List<Language> updateFunction(int index, int id, String name) {
		 
		return iRepository.updateMethods(index,id, name);
	}*/
	
		

}
