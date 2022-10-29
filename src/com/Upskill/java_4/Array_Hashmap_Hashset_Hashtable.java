package com.Upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array store multiple data using index
		int age= 30;                                    	//Variable
		int[] ageThanos = new int []{30,35,27,22,40,32};           //Array
		String[] nameThanos =new String []{"Nayeem","Pranta","Sazzaa","O"};
		//Array index               [0][1][2][3][4][5]
		
		//System.out.println("Student Age " + ageThanos[3]);
		//System.out.println("Total Student " + ageThanos.length);  //length counts the total value
		//System.out.println("Student Name:  " + nameThanos[0]);
		//System.out.println("Student length " + nameThanos.length);
		
		//Multi-Diamentional Array
		int [][] ageThanos2D = {{30,35,27,22,40,32},		//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
			                 	{37,26,24,35}};             //[1][0] [1][1] [1][2] [1][3] 
		//System.out.println("Student Age 2D : "+ ageThanos2D[0][4]);
		
		
		//Hashmap store multiple data using key-value pair ,Implementation of map interface
		
	//	HashMap<String, Integer> Student = new HashMap<String,Integer>();
	//	Student.put ("Ava", 23);
	//	Student.put ("Fahim",35);
	//	Student.put ("Pranta",24);
	//	System.out.println("Student Age " + Student.get("Ava"));
		
		HashMap<String,String> Country= new HashMap<String,String>();
		Country.put ("Bangladesh", "Sylhet");
		Country.put ("UK", "London");
		Country.put ("USA","DC");
				System.out.println("Capital  :" + Country.get("USA"));
				
		//Hashset store unordered collection containing unique value,Implementation of set interface
		
		HashSet<String> car= new HashSet<String>();
		car.add("BMW");
		car.add("Audi");
		car.add("Ford");
		System.out.println("Car  :"+ car);
		
		HashSet<Integer> age1=new HashSet<Integer>();
		age1.add(21);
		age1.add(22);
		age1.add(25);
		System.out.println("age: " + age1);
		
		
		Hashtable<String,String> Region=new Hashtable<String,String>();
		Region.put("BD", "Asia");
		Region.put("USA", "North America");
		System.out.println(Region.get("BD"));

		
		
	
				
				
				
		
		}
		
		

	}


