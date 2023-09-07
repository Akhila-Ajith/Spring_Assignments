package com.nissan.app;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.model.Book;
import com.nissan.service.IBook;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int opt;
		ArrayList<Book> lib = new ArrayList<Book>();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		do {
			System.out.println("Choose an Option : ");
			System.out.println("1-Add");
			System.out.println("2-Search");
			System.out.println("3-List");
			System.out.println("4-Exit");
			System.out.print("option : ");
			opt = scan.nextInt();
			if(opt==1) {
				IBook book = context.getBean("library",IBook.class);
				Book bookdata = context.getBean("bookdata",Book.class);
				book.add(lib,bookdata);
			}
			else if(opt==2) {
				IBook book2 = context.getBean("library",IBook.class);
				book2.getDetails(lib);
			}
			else if(opt==3) {
				IBook book3 = context.getBean("library",IBook.class);
				book3.listBooks(lib);
			}
		}while(opt!=4);
	}

}
