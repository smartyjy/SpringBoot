package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //通过年龄查询
    List<Girl> findByAge(Integer age);

}
