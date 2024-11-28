package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Poste;

@RepositoryRestResource(path = "poss")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular

public interface PosteRepository extends JpaRepository<Poste, Long>{

}
