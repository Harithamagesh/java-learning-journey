package com.task;

import java.util.ArrayList;

public class College {
	
	public static void main(String[] args) {
		
		ArrayList< ListTask> details=new ArrayList<ListTask>();
		//generic type parameter and contains a concrete type(ListTask);
		
		details.add(new ListTask("haritha", "NGP", "AI&DS"));
		details.add(new ListTask("naresh", "KGisl", "MCA"));
		details.add(new ListTask("pavish", "SNS", "MBA"));
		
		for (ListTask detail : details) {
		    System.out.println(detail);
		}

		
	}

}
