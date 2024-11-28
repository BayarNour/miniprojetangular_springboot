package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idEmploye;
	private String nomEmploye;
	private Double salaireEmploye;
	private Date dateEmploye;
	
	@ManyToOne
	private Poste poste;
	
	
	
	public Employe() {
		super();
		
	}
	
	
	
	public Employe(Long idEmploye, String nomEmploye, Double salaireEmploye, Date dateEmploye) {
		super();
		this.idEmploye = idEmploye;
		this.nomEmploye = nomEmploye;
		this.salaireEmploye = salaireEmploye;
		this.dateEmploye = dateEmploye;
	}
	 public Employe(String nomEmploye, Double salaireEmploye, Date dateEmploye) {
	        super();
	        this.nomEmploye = nomEmploye;
	        this.salaireEmploye = salaireEmploye;
	        this.dateEmploye = dateEmploye;
	    }



	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", nomEmploye=" + nomEmploye + ", salaireEmploye=" + salaireEmploye
				+ ", dateEmploye=" + dateEmploye + "]";
	}



	public Long getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public Double getSalaireEmploye() {
		return salaireEmploye;
	}
	public void setSalaireEmploye(Double salaireEmploye) {
		this.salaireEmploye = salaireEmploye;
	}
	public Date getDateEmploye() {
		return dateEmploye;
	}
	public void setDateEmploye(Date dateEmploye) {
		this.dateEmploye = dateEmploye;
	}



	public Poste getPoste() {
		return poste;
	}



	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	
}
