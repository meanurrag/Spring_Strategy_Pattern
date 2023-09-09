package com.ranjan.comps;

public final class BlueDart implements Courier {  //Dependent class 2

	
	public BlueDart() {
		System.out.println("BlueDart Zero Param Constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return oid+" order will be delivered by BlueDart";
	}

}
