package com.task;

import java.util.ArrayList;
import java.util.List;

public class PatientList {
	
	public static void main(String[] args) {
		List<PatientDetails> patient = new ArrayList<>();
		patient.add(new PatientDetails("Ajay", 25, 123, "Male"));
		patient.add(new PatientDetails("Arun", 11, 654, "Male"));
		patient.add(new PatientDetails("Jaya", 41, 789, "Female"));
		patient.add(new PatientDetails("Latha",33,112, "Female"));
		
		for(PatientDetails p : patient) {
			System.out.println("Name:"+p.name +"  Age:"+p.age +" Patient_id:"+p.patient_id +" Gender:"+p.gender);
		}
		System.out.println("----------------------------------------------");
		patient.stream().map(p -> p.name.toUpperCase()).forEach(System.out::println);
		System.out.println("----------------------------------------------");
		patient.stream().map(p -> p.gender.toUpperCase()).forEach(System.out::println);
		System.out.println("----------------------------------------------");
		patient.stream().filter(p -> p.name.startsWith("A")).forEach(System.out::println);
		System.out.println("----------------------------------------------");
		patient.stream().sorted((p1 , p2) -> Integer.compare(p1.age , p2.age)).forEach(System.out::println);
		
	}	

}
