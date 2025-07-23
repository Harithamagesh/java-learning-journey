package com.oops.inheritance;

public class Main4 {
	
	public static void main(String[] args) {
		
		IPL  ipl = new IPL();
		ipl.IPLInfo();
		ipl.IPLDetails();
		
		CSK csk = new CSK();
		csk.yellow();
		csk.CSKDetail();
		
		RCB rcb = new RCB();
		rcb.red();
		rcb.RCBDetails();
		
		Person1 p1 = new Person1();
		p1.team();
		p1.P1Details();

		Person2 p2 = new Person2();
		p2.team();
		p2.P2Details();
		
	}

}
