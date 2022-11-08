package Kodlama.io.Devs.business.concretes.request;




import Kodlama.io.Devs.entities.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateItemsRequest {
	
	
	private int id;
	private String name;
	private Language language;

}
