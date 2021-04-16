package lambdaschool.javazoo.Services;

import lambdaschool.javazoo.Repositories.AnimalRepository;
import lambdaschool.javazoo.Views.AnimalCounts;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;


    @Override
    public List<AnimalCounts> getAllAnimalsAndCounts()
    {
        List<AnimalCounts> rtnList = animalRepository.FindAllAnimalsAndCounts();
        return rtnList;
    }

}
