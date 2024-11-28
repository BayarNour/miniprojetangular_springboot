package com.example.demo;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Employe;
import com.example.demo.entities.Poste;
import com.example.demo.repos.EmployeRepository;

@SpringBootTest
class EmployeApplicationTests {

	@Autowired
	private EmployeRepository employeRepository;
	
	
	@Test
	public void testCreateEmploye() {
	Employe emp = new Employe( "amira ben salah",2000.000,new Date());
	employeRepository.save(emp);
	}
	
	
	@Test
	public void testFindEmploye()
	{
	Employe e = employeRepository.findById(1L).get(); 
	System.out.println(e);
	}





@Test
public void testUpdateEmploye()
{
Employe e = employeRepository.findById(1L).get(); 
e.setSalaireEmploye(1900.0);
employeRepository.save(e);
System.out.println(e);
}





@Test
public void testDeleteEmploye()
{
	employeRepository.deleteById(1L);
	
}



@Test
public void testFindAllEmployes()
{
	List<Employe> emp =employeRepository.findAll();
	for (Employe e:emp)
		System.out.println(e);
	
	
}



@Test
public void testFindEmployeByNom()
{
	List<Employe>emp=employeRepository.findByNomEmploye("amira ben salah");

	for (Employe e:emp)
		System.out.println(e);
	
}




@Test
public void testFindEmployeByNomContains()
{
	List<Employe>emp=employeRepository.findByNomEmployeContains("a");

	for (Employe e:emp)
		System.out.println(e);
	
}



@Test
public void testfindByNomSalaire()
{
List<Employe> emp = employeRepository.findByNomSalaire("amira ben salah", 1000.0);
for (Employe e : emp)
{
System.out.println(e);
}

}




@Test
public void testfindByPoste()
{
Poste poss = new Poste();
poss.setIdPoste(1L);
List<Employe> emp = employeRepository.findByPoste(poss);
for (Employe e : emp)
{
System.out.println(e);

}

}
@Test
public void findByPosteIdPoste()
{
List<Employe> emp = employeRepository.findByPosteIdPoste(1L);
for (Employe e : emp)
{
System.out.println(e);
}
 }


@Test
public void testfindByOrderByNomEmployeAsc()
{
List<Employe> emp = employeRepository.findByOrderByNomEmployeAsc();
for (Employe e : emp)
{
System.out.println(e);
}

}




@Test
public void testTrierEmployeNomsSalaire()
{
List<Employe> emp = employeRepository.trierEmployeNomsSalaire();
for (Employe e : emp)
{
System.out.println(e);
}
}










}  



















