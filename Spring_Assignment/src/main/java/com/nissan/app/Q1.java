package com.nissan.app;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.service.IVehicle;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt=0;
		Scanner scan=new Scanner(System.in);
		ClassPathXmlApplicationContext iocContext=new ClassPathXmlApplicationContext("VehicleConfig.xml");
		IVehicle Vehicle=iocContext.getBean("honda",IVehicle.class);
		IVehicle Vehicle1=iocContext.getBean("tata",IVehicle.class);
		char choice;
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Honda");
			System.out.println("2.Tata");
			opt=scan.nextInt();
		if(opt==1) {
			System.out.println("Brand : "+Vehicle.getBrandName());
		System.out.println("Car : "+Vehicle.getVehicleName());
		}
		else if(opt==2) {
		System.out.println("Brand : "+Vehicle1.getBrandName());
		System.out.println("Car : "+Vehicle1.getVehicleName());
	}
		System.out.println("Would you like to continue");
		choice=scan.next().charAt(0);
		}while(choice=='y'||choice=='Y');

}
}
