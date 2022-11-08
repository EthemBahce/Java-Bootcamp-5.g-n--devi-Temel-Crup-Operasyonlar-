package Kodlama.io.Devs.webApi.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ItemIService;
import Kodlama.io.Devs.business.concretes.request.CreateItemsRequest;
import Kodlama.io.Devs.business.concretes.responses.GetAllItemsResponses;

@RestController
@RequestMapping("/api/ItemsController")
public class ItemsController {

	private final ItemIService itemIService;
	
	public ItemsController(ItemIService itemIService) {
		this.itemIService = itemIService;
	}
	
	@GetMapping("/getall")
	public List<GetAllItemsResponses> getAll(){
		return this.itemIService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateItemsRequest createItemsRequest) {
		 this.itemIService.add(createItemsRequest);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable("id") int id, @RequestBody CreateItemsRequest createItemsRequest) {
	   this.itemIService.update(id, createItemsRequest);	
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		this.itemIService.delete(id);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
