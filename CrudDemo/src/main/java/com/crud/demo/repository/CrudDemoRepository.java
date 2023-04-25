package com.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.model.CrudDemo;

@Repository
public interface CrudDemoRepository extends JpaRepository<CrudDemo,Integer> {

}
