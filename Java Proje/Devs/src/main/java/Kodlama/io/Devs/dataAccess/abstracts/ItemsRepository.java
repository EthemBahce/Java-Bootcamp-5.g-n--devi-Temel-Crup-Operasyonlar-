package Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.entities.Items;


@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer>{

}
