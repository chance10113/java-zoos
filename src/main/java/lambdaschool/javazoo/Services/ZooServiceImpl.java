package lambdaschool.javazoo.Services;

import lambdaschool.javazoo.Models.Zoo;
import lambdaschool.javazoo.Repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ZooServiceImpl implements ZooService{
    @Autowired
    private ZooRepository zoosRepository;

    @Override
    public List<Zoo> findAll()
    {
        List<Zoo> rtnList = new ArrayList<>();
        zoosRepository.findAll()
                .iterator()
                .forEachRemaining(rtnList::add);
        return rtnList;
    }

    @Override
    public Zoo findByZooId(long zooid)
    {
        return zoosRepository.findById(zooid).orElseThrow(()-> new EntityNotFoundException("Zoo id " + zooid + " Not Found"));
    }
}
