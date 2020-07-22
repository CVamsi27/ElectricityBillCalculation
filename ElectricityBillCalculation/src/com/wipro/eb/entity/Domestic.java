package com.wipro.eb.entity;

public class Domestic extends Connection{
	
	public Domestic(int currentReading, int previousReading, float slabs[]) {
		super(currentReading,previousReading,slabs);
	}
	
	public float computeBill() {
		float u = currentReading-previousReading;
		if(u<50) return u*slabs[0];
		else if(u<100) return (50*slabs[0])+((u-50)*slabs[1]);
		else  return (50*slabs[0])+(50*slabs[1])+((u-100)*slabs[2]);
	}
}
