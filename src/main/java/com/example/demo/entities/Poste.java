package com.example.demo.entities;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Poste {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPoste;
	private String nomPoste;
	private String descriptionPoste;
	
	@JsonIgnore
	@OneToMany(mappedBy="poste")
	private List<Employe>employes;
	
	
	

}
