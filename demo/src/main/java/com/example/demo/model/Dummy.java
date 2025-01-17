package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dummy")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Dummy {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;


   @Column(name = "name")
   private String name;


   @Column(name = "color")
   private String color;

}
