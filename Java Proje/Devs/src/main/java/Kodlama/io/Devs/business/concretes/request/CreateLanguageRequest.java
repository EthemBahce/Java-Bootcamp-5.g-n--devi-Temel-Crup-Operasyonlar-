package Kodlama.io.Devs.business.concretes.request;


import java.util.List;

import Kodlama.io.Devs.entities.Items;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageRequest {
	
	private int id;
	private String name;
	private List<Items> items;

}
