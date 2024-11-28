package com.example.demo.service;

import java.util.List;


import com.example.demo.entities.Employe;
import com.example.demo.entities.Poste;

public interface EmployeService {
	Employe saveEmploye(Employe e);
	Employe updateEmploye(Employe e);
	void deleteEmploye(Employe e);
	 void deleteEmployeById(Long id);
	 Employe getEmploye(Long id);
	List<Employe> getAllEmployes();
	List<Employe> findByNomEmploye(String nom);
	List<Employe> findByNomEmployeContains(String nom);
	List<Employe> findByNomSalaire(String nom, Double salaire);
	List<Employe> findByPoste (Poste poste);
	List<Employe> findByPosteIdPoste(Long id);
	List<Employe> findByOrderByNomEmployeAsc();
	List<Employe> trierEmployeNomsSalaire();

}
