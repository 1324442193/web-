package cn.upcloud.restprovider.controller;


import cn.upcloud.restprovider.mapper.PersonMapper;
import cn.upcloud.restprovider.mapper.PlaceMapper;
import cn.upcloud.restprovider.model.Person;
import cn.upcloud.restprovider.model.Place;
import cn.upcloud.restprovider.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PersonController {
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private PlaceMapper placeMapper;
    @RequestMapping("getallperson")
    public List<Person> getperson(){
        List<Person> p = personMapper.getperson();
        return p;
    }
    @RequestMapping("getallplace")
    public List<Place> getplaces(){
        List<Place> p1 = placeMapper.getallplace();
        return p1;
    }
    @RequestMapping("getallproduct")
    public List<Product> getproduct(){
        List<Product> p2 = placeMapper.getallproduct();
        return p2;
    }

}
