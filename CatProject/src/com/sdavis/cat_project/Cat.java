package com.sdavis.cat_project;

public class Cat extends CatTest {
	
	

	//Member variables
	private String name;
	private String gender;
	private int age;
	private boolean isAMouser = true; 
	double weight;
	

	
	//constructor
	public Cat(String name, String gender, int age, boolean isAMouser, double weight) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.isAMouser=isAMouser;
		this.weight=weight;
		
		
		
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
		
		
	}

	public Integer getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
		
				
	}

	public String getGender() {
		return this.gender;
				
	}
	public void setGender(String gender) {
		this.gender = gender;
	
	}
	

			
	public double getWeight()  {
		return this.weight;
		
	    }

	public boolean isAMouser() {
		return isAMouser;
	}

	public void setAMouser(boolean isAMouser) {
		this.isAMouser = isAMouser;
	}
	//for loop example 
	public void meow(int numTimes) {
		for (int i = 0; i < numTimes; i++) {
			System.out.println(this.name + " Meow!...");
		}
		
	
	}
	
		
	}
	
				
	

