package com.Upskill.java_5;

public class ChildofAbstractClass extends AbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void iDoor(){
		int door = 4;
		System.out.println("Door :" + door);
	}
				
	

	@Override
	public void iSeat(){
		int seat = 4;
				System.out.println("Seat  :" + seat);
	}
		
		
	

	@Override
	public void iWheel(){
		int wheel= 4;
		System.out.println("Wheel  :"+ wheel);
	
		
	}

	@Override
	public void iRadio(){
		int radio = 1;
		System.out.println("Radio  :"+ radio);
	}
		
		public static void manin(String[]  agrs){
			ChildofAbstractClass obj = new ChildofAbstractClass();
			obj.iDoor();
			obj.iRadio();
			obj.iSeat();
			obj.iWheel();
		}
}