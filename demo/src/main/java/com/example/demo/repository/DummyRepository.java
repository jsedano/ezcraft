package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Dummy;


public interface DummyRepository extends JpaRepository<Dummy, Long>{

}
