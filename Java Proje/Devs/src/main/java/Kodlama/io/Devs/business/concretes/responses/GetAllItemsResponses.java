package Kodlama.io.Devs.business.concretes.responses;

import Kodlama.io.Devs.entities.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllItemsResponses {

	
	private int id;
	private String name;
	private Language language;
}
