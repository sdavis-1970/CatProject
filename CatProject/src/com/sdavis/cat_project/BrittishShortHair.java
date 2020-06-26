package com.sdavis.cat_project;

public class BrittishShortHair extends Cat {

	public BrittishShortHair(String name, String gender, int age, boolean isAMouser, double weight) {
		super(name, gender, age, isAMouser, weight);
		// TODO Auto-generated constructor stub
	}
	public void scratch(int numTimes) {
		for (int i = 0; i < numTimes; i++) {
		System.out.println("Stop scratching!");
	}

}
}

