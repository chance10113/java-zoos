package lambdaschool.javazoo.Controllers;


import lambdaschool.javazoo.Services.AnimalService;
import lambdaschool.javazoo.Views.AnimalCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {


    @Autowired
    private AnimalService animalService;

    //    http://localhost:2019/animals/count
    @RequestMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> getAllAnimalsAndCounts()
    {
        List<AnimalCounts> rtnList = animalService.getAllAnimalsAndCounts();
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

}
