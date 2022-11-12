package com.example.mysqldatabaseconnection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MysqlRepo extends JpaRepository<Actor,Integer> {

}
