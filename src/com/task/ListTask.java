package com.task;

public class ListTask {
	
	String name;
	String collegeName;
	String deptName;
	
	public ListTask(String name,String collegeName, String deptName) {
		this.name = name;
		this.collegeName = collegeName;
		this.deptName = deptName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	private void display() {
		System.out.println("name:" + name);
		System.out.println("collegeName:" + collegeName);
		System.out.println("deptName:" + deptName);

	}
	@Override
	public String toString() {
		return "[name=" + name + ", collegeName=" + collegeName + ", deptName=" + deptName + "]";
		
	}
	
	

}
