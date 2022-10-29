package com.Upskill.java_5;

public class Encapsulation {
//Encapsulation used to hide the data using setter and getter method 
	
	
	private String name ="Sami";						//Write and read
	private int ssn = 1123312412;						//Write
	private String username = "Sami123";				//Read
	
	
	
	//setter method- name
			public void setName(String value){			//set the data- write
				name= value;
			}
			
			//getter method - name
			
		public String getName(){						//get the data- read
			return name;
		}
		
			

		
//setter method-ssn
				public void setSSN(int value){
					ssn = value;
				}
					
					//getter method
		public String getUsername(){
			return username;
		}
						

						public static void main(String[] args) {
							Encapsulation obj = new Encapsulation();
							obj.setName("Sazzad");
							System.out.println(obj.getName());
							obj.setSSN(12334567);
							System.out.println(obj.getUsername());
							
						}

						
					}
	
			