package lambdaschool.javazoo.Repositories;

import lambdaschool.javazoo.Models.Animal;
import lambdaschool.javazoo.Views.AnimalCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
    @Query(value = "SELECT  a.animaltype, a.animalid , count(zooid) countzoos " +
            "FROM  animals a LEFT JOIN  zooanimals z " +
            "ON  a.animalid = z.animalid " +
            "GROUP BY a.animaltype " +
            "ORDER BY a.animaltype",
            nativeQuery = true)
    List<AnimalCounts> FindAllAnimalsAndCounts();
}
