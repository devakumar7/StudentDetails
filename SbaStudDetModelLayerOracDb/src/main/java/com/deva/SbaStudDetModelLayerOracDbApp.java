package com.deva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deva.repo.StudentRepo;
import com.deva.model.Student;

@SpringBootApplication
public class SbaStudDetModelLayerOracDbApp implements CommandLineRunner 
{
	@Autowired
	private StudentRepo stdRepo;

	public static void main(String[] args) {
		SpringApplication.run(SbaStudDetModelLayerOracDbApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Student s=new Student(102,"krishna","Spring");
		Student s1=new Student(103,"kiran","Spring boot");
		Student s2=new Student(104,"sudheer","Hibernate");
		stdRepo.save(s);
		stdRepo.save(s1);
		stdRepo.save(s2);
		System.out.println("New Record Inserted succesfully"); */
		
		/*System.out.println("==========Delete Record========");
		stdRepo.deleteById(101); 
		System.out.println("One Record Deleted");*/
		
		/*System.out.println("-----------UPDATE----------------");
		Student oldrec = stdRepo.findById(102).get();
		oldrec.setStdName("KannaBabu");
		oldrec.setCourse("OOPS");
		stdRepo.save(oldrec);
		System.out.println("One Record Updated......."); */
		
	/*	System.out.println("-----------SELECT ONE RECORD------------");
		Student s1 = stdRepo.findById(104).get();
		System.out.println(s1);  */
		
		System.out.println("---------SELECT ALL RECORDS---------");
		stdRepo.findAll().forEach(student->{
			System.out.println(student);
		});
	}

}
