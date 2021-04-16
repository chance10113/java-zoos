package lambdaschool.javazoo.Services;

import lambdaschool.javazoo.Views.AnimalCounts;

import java.util.List;

public interface AnimalService {
    List<AnimalCounts> getAllAnimalsAndCounts();
}
