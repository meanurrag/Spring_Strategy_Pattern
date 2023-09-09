package com.ranjan.comps;

public final class DTDC implements Courier {  //Dependent class 1

	public DTDC() {
		System.out.println("DTDC Zero Param Constructor");
	}
	@Override
	public String deliver(int oid) {
		
		return oid+" Will be delivered by DTDC";
	}

}
