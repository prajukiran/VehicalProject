package com.client;

import com.service.Rto;
import com.service.Pune;
import java.util.*;

public class Test {
   
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Rto r=new Pune();
		while(true) {
			System.out.println("welcom to vehical Registeration System\noptions");
			System.out.println("1.Register your vehicle\n2.View your vehicle\n3.update your details");
			
			System.out.println("what is your choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1: r.regVehicle();
			        break;
			case 2: r.viewDetails();
			        break;
			case 3: r.updateVehicle();
			        break;
			default : System.out.println("invalid choice");
			}
		}
	}
}


