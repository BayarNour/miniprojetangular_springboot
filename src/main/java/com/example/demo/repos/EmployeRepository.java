package com.example.demo.repos;


import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Employe;
import com.example.demo.entities.Poste;




@RepositoryRestResource(path = "rest")
public interface EmployeRepository extends JpaRepository<Employe, Long> {


List<Employe> findByNomEmploye(String nom);
List<Employe> findByNomEmployeContains(String nom);

@Query("select e from Employe e where e.nomEmploye like %:nom and e.salaireEmploye > :salaire")
List<Employe> findByNomSalaire (@Param("nom") String nom,@Param("salaire") Double salaire);



@Query("select e from Employe e where e.poste = ?1")
List<Employe> findByPoste (Poste poste);

List<Employe> findByPosteIdPoste(Long id);

List<Employe> findByOrderByNomEmployeAsc();

@Query("select e from Employe e order by e.nomEmploye ASC, e.salaireEmploye DESC")
List<Employe> trierEmployeNomsSalaire ();




}
