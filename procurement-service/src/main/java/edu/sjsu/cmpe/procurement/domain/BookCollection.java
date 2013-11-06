package edu.sjsu.cmpe.procurement.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookCollection {
	
	@JsonProperty("shipped_books")
	private List<Book> bookCollection = new ArrayList<Book>();
	
	public List<Book> getBookCollection(){
		return bookCollection;
	}
	
	
	public void setBookCollection(List<Book> bookCollection){
		
		this.bookCollection = bookCollection;
		
	}
}
