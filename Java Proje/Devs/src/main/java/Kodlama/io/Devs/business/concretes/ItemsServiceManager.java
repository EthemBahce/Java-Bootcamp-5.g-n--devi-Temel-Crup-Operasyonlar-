package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ItemIService;
import Kodlama.io.Devs.business.concretes.request.CreateItemsRequest;
import Kodlama.io.Devs.business.concretes.responses.GetAllItemsResponses;
import Kodlama.io.Devs.dataAccess.abstracts.ItemsRepository;
import Kodlama.io.Devs.entities.Items;

@Service
public class ItemsServiceManager implements ItemIService {
	
	private final ItemsRepository itemsRepository;
	
	@Autowired
	public ItemsServiceManager(ItemsRepository itemsRepository) {
		this.itemsRepository = itemsRepository;
	}
	

	@Override
	public List<GetAllItemsResponses> getAll() {
		List<GetAllItemsResponses> getAllItemsResponses = new ArrayList<GetAllItemsResponses>();
		List<Items> items = this.itemsRepository.findAll();
		
		for (Items item : items) {
			GetAllItemsResponses responseItem = new GetAllItemsResponses();
			responseItem.setId(item.getId());
			responseItem.setName(item.getName());
			responseItem.setLanguage(item.getLanguage());
			getAllItemsResponses.add(responseItem);
		}
		
		
		return getAllItemsResponses;
	}

	@Override
	public void add(CreateItemsRequest createItemsRequest) {
		Items items = new Items();
		items.setId(createItemsRequest.getId());
		items.setName(createItemsRequest.getName());
		items.setLanguage(createItemsRequest.getLanguage());
		this.itemsRepository.save(items);
		
	}

	@Override
	public void update(int id, CreateItemsRequest createItemsRequest) {
		List<Items> items = new ArrayList<Items>();
		Items item1 = new Items();
		
		for (Items item : items) {
			if(item.getId() == id) {
				this.itemsRepository.delete(item);
			}
		}
		
		item1.setId(createItemsRequest.getId());
		item1.setName(createItemsRequest.getName());
		item1.setLanguage(createItemsRequest.getLanguage());
		
		this.itemsRepository.save(item1);
		
		
		
	}

	@Override
	public void delete(int id) {
		
	this.itemsRepository.deleteById(id);
		
	}

}
