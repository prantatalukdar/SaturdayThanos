package com.Upskill.java_2;

public class IfelseStaement {

	static int age=140;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age();

	}
	//If else statement
	public static void age(){
		if (age < 13){
			System.out.println("You are a child");
		}else if (age > 12 && age < 18) {
			System.out.println("You are a teenager");
		}else if (age >=60){
			System.out.println("You are a senior");
		//Nested ifelse statement
			if (age > 100){
				System.out.println("you are a hero");
			}
		}else{ 
			System.out.println( "You are an adult");
		} 
	} 

}
