package lambdaschool.javazoo.Repositories;

import lambdaschool.javazoo.Models.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepository extends CrudRepository<Telephone, Long> {
}
