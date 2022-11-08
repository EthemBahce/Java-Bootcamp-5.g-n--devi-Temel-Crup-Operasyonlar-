package Kodlama.io.Devs.webApi.Controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Kodlama.io.Devs.business.abstracts.IService;
import Kodlama.io.Devs.business.concretes.request.CreateLanguageRequest;
import Kodlama.io.Devs.business.concretes.responses.GetAllLanguageResponses;



@RestController
@RequestMapping("/api/languageController")
public class LanguagesController {
	
	
	private IService services;
	
	@Autowired
	public LanguagesController(IService services) {
		this.services = services;
		
	}
		
	@GetMapping("/getall")
	public List<GetAllLanguageResponses> getAll(){
		return services.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateLanguageRequest createLanguageRequest) {
		
		this.services.add(createLanguageRequest);
	}
	
	@PutMapping("/update/{id}")
	void update(@PathVariable("id") int id, @RequestBody CreateLanguageRequest createLanguageRequest) {
		this.services.update(id ,createLanguageRequest);
	}
	
	@DeleteMapping("/delete/{id}")
	void delete(@PathVariable("id") int id) {
		this.services.delete(id);
	}
	
	
	
		
		}


















	
	/*@GetMapping("/getall")
	List<Language> getAll(){
		return services.getAll();
	}
	
	
    @GetMapping("/getid/index/{index}")
	Language getId(@PathVariable("index") int index) {
		return services.getId(index);
	}
	
	
	@PostMapping("/save/id/{id}/name/{name}")
	List<Language> add(@PathVariable("id") int id, @PathVariable("name") String name){
		
		
		return services.addFunction(id, name);
		
		
		}
	
	@PutMapping("/update/index/{index}/id/{id}/name/{name}")
	List<Language> update(@PathVariable(value = "index") int index, @PathVariable(value = "id") int id, @PathVariable(name = "name") String name){
		return services.updateFunction(index,id, name);
	}
	
	@DeleteMapping("/delete/index/{index}")
	List<Language> delete(@PathVariable(value = "index") int index){
		return services.deleteFunction(index);
	}*/

