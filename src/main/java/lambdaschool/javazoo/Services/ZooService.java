package lambdaschool.javazoo.Services;

import lambdaschool.javazoo.Models.Zoo;

import java.util.List;

public interface ZooService {
    Zoo findByZooId(long zooid);

    List<Zoo> findAll();

}
