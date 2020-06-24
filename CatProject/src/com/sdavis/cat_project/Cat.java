package com.sdavis.cat_project;

public class Cat {
	
	

	
	private String name;
	private String gender;
	private int age;
	boolean isAMouser; 
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
	public void meow() {
		System.out.println(this.name+" Meow!...");
	}

	
		boolean isAMouser = true;
		if (isAMouser = false) {
			System.out.println("My cat is NOT a Mouser!");
		}
	else {
			System.out.println( "My cat IS a Mouser." );
		}	
	
	
	
	public double getWeight()  {
		return this.weight;
		System.out.println ("My cat weighs..." + double weight);
	    }
		
				
	}

