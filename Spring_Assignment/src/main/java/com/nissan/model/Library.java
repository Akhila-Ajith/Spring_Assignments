package com.nissan.model;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.nissan.service.IBook;
@Component("library")
public class Library implements IBook {
	Scanner scan = new Scanner(System.in);

	@Override
	public boolean add(ArrayList<Book> lib, Book book) {
		// TODO Auto-generated method stub
		System.out.println("Enter the title of the book : ");
		book.setTitle(scan.nextLine());
		System.out.println("Enter the author of the book : ");
		book.setAuthor(scan.nextLine());
		System.out.println("Enter the ISBN : ");
		book.setIsbn(scan.nextLine());
		lib.add(book);
		return true;
	}

	@Override
	public boolean getDetails(ArrayList<Book> lib) {
		// TODO Auto-generated method stub
		System.out.println("Enter the ISBN number for the book : ");
		String isbn = scan.next();
		for(Book b :lib) {
			if(b.getIsbn().equals(isbn)) {
				System.out.println("Book Title : "+b.getTitle());
				System.out.println("Book Author : "+b.getAuthor());
				System.out.println("Book ISBN : "+b.getIsbn());
				return true;
			}
		}
		return false;
	}

	@Override
	public void listBooks(ArrayList<Book> lib) {
		// TODO Auto-generated method stub
		for(Book b :lib) {
			System.out.println("Book Title : "+b.getTitle());
			System.out.println("Book Author : "+b.getAuthor());
			System.out.println("Book ISBN : "+b.getIsbn());
		}
	}

}
