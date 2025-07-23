package com.task;

public class PatientDetails {
	
	String name;
	int age;
	int patient_id;
	String gender;
	
	public PatientDetails(String name, int age, int number, String gender){
		this.name = name;
		this.age = age;
		this.patient_id = number;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", patient_id=" + patient_id + ", gender=" + gender;
	}
	
	
	
}
