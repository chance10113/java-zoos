package lambdaschool.javazoo.Repositories;

import lambdaschool.javazoo.Models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
}
