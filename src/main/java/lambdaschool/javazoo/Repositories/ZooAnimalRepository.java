package lambdaschool.javazoo.Repositories;

import lambdaschool.javazoo.Models.ZooAnimal;
import lambdaschool.javazoo.Models.ZooAnimalId;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalRepository extends CrudRepository<ZooAnimal, ZooAnimalId> {
}
