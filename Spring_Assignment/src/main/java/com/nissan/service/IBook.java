package com.nissan.service;

import java.util.ArrayList;

import com.nissan.model.Book;

public interface IBook {
	public boolean add(ArrayList<Book> lib,Book bookdata );
	public boolean getDetails(ArrayList<Book> lib);
	public void listBooks(ArrayList<Book> lib);
}
