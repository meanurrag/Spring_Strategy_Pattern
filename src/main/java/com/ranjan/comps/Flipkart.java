package com.ranjan.comps;

public final class Flipkart {

	private Courier courier; // HAS-A relation

	public Flipkart() {

		System.out.println("Flipkart 0 param constructor");
	}

	public void setCourier(Courier c) {

		this.courier = c;
	}

	public String shoping(String[] items, double[] price) {

		System.out.println("Flipkart.shoping()");
		double billamt = 0.0;
		for (double p : price) {
			billamt += p;
		}
		int oid = (int) (Math.random() * 1000);
		String msg = courier.deliver(oid);
		return oid + "Shoping done for " + billamt + "->" + msg;
	}
}
