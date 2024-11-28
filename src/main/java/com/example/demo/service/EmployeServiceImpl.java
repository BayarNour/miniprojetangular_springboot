package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employe;
import com.example.demo.entities.Poste;
import com.example.demo.repos.EmployeRepository;


@Service
public class EmployeServiceImpl implements EmployeService {
	
	@Autowired
	EmployeRepository employeRepository ;

	@Override
	public Employe saveEmploye(Employe e) {
	
		return employeRepository.save(e);
	}

	@Override
	public Employe updateEmploye(Employe e) {
		return employeRepository.save(e);
	}

	@Override
	public void deleteEmploye(Employe e) {
		employeRepository.delete(e);
		
	}

	@Override
	public void deleteEmployeById(Long id) {
		employeRepository.deleteById(id);
	}

	@Override
	public Employe getEmploye(Long id) {
		return employeRepository.findById(id).get();
	}

	@Override
	public List<Employe> getAllEmployes() {
		
		return employeRepository.findAll();
	}

	@Override
	public List<Employe> findByNomEmploye(String nom) {
		return employeRepository.findByNomEmploye(nom);
	}

	@Override
	public List<Employe> findByNomEmployeContains(String nom) {
		return  employeRepository.findByNomEmployeContains(nom);
	}

	@Override
	public List<Employe> findByNomSalaire(String nom, Double salaire) {
		
		return employeRepository.findByNomSalaire(nom,salaire);
	}

	@Override
	public List<Employe> findByPoste(Poste poste) {
		
		return  employeRepository.findByPoste(poste);
	}

	@Override
	public List<Employe> findByPosteIdPoste(Long id) {
		
		return employeRepository.findByPosteIdPoste(id);
	}

	@Override
	public List<Employe> findByOrderByNomEmployeAsc() {
		
		return employeRepository.findByOrderByNomEmployeAsc();
	}

	@Override
	public List<Employe> trierEmployeNomsSalaire() {
	
		return employeRepository.trierEmployeNomsSalaire();
	}

}
