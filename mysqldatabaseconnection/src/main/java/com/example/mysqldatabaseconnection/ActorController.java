package com.example.mysqldatabaseconnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActorController {

    @Autowired
    MysqlRepo mysqlRepo;

    @GetMapping("/get-all-actors")
    public List<Actor> getAllActors() {
        return mysqlRepo.findAll();
    }

    @GetMapping("/get-address/{id}")
    public Actor getSingleAddress(@PathVariable("id") Integer id) {
        return mysqlRepo.findById(id).get();
    }


}
