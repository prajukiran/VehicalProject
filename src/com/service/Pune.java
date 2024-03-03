package com.service;

import com.model.Vehicle; 

import java.util.*;

public class Pune implements Rto{

	Vehicle v=new Vehicle();
	Scanner s=new Scanner(System.in);
	
	public void regVehicle() {
		System.out.println("enter registeration id: ");
		v.setRegId(s.nextInt());
		System.out.println("enter model name: ");
		v.setModelName(s.next());
		System.out.println("enter price: ");
		v.setPrice(s.nextFloat());
		System.out.println("enter colour: ");
		v.setColour(s.next());
		System.out.println("enter area: ");
		v.setArea(s.next());
		System.out.println("enter owner name: ");
		v.setOwnerName(s.next());
		System.out.println("enter mobile no: ");
		v.setMob(s.nextLong());
		System.out.println("enter adhar no: ");
		v.setAdhar(s.nextLong());
	}
	
	
	public void viewDetails() {
		
		System.out.println("registeration id: "+v.getRegId());
		System.out.println("model name: "+v.getModelName());
		System.out.println("price: "+v.getPrice());
		System.out.println("colour: "+v.getColour());
		System.out.println("area: "+v.getArea());
		System.out.println("owner name: "+v.getOwnerName());
		System.out.println("mobile no: "+v.getMob());
		System.out.println("adhar no: "+v.getAdhar());
	}
	
	
	public void updateVehicle() {
		System.out.println("1.update price\n2.update owner name\n3.update mobile number\n4.adhar number");
		int ch=s.nextInt();
		
		switch(ch) {
		     
		case 1: System.out.println("enter new price: ");
		        float updtprice=s.nextFloat();
		        System.out.println("your previous price is: "+v.getPrice());
		        v.setPrice(updtprice);
		        System.out.println("updated price is"+v.getPrice());
		        break;
		
		case 2: System.out.println("enter your new name: ");
		        String updtName=s.next();
		        System.out.println("your previous name is: "+v.getOwnerName());
		        v.setOwnerName(updtName);
		        System.out.println("updated name is: "+v.getOwnerName() );
		        break;
		
		case 3: System.out.println("enter new mobile: ");
		        long updtmob=s.nextLong();
		        System.out.println("your previous number is: "+v.getMob());
		        v.setMob(updtmob);
		        System.out.println("updated mobile number is: "+v.getMob());
		        break;
		
		case 4: System.out.println("enter new aadhar no: ");
		        long updtadhar=s.nextLong();
		        System.out.println("your previous aadhar no is: "+v.getAdhar());
		        v.setAdhar(updtadhar);
		        System.out.println("updated aadhar no: "+ v.getAdhar());
		        break;
		
		default : System.out.println("Invalid choice");
		 
		}
		
	}
}
