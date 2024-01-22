package library;

import data.Book;
import data.Map;
import data.Newspaper;

public class App {

	public static void main(String[] args) {
		Library library = new Library();
	
		library.stockAdd(new Book("Capt Underpants", 1997, "Dav Pilkey", "Childrens"));
		library.stockAdd(new Book("Atlantis Found", 1999, "Clive Cussler", "Fiction"));
		library.stockAdd(new Book("Wuthering Heights", 1847, "Emily Bronte", "Classic"));
		
		library.stockAdd(new Map("Australia", 1770, "Captain James Cook", "Oceania"));
		library.stockAdd(new Map("Honduras", 1492, "Christopher Columbus", "North America"));
		library.stockAdd(new Map("Japan", 1600, "William Adams", "Asia"));
		
		library.stockAdd(new Newspaper("The Daily Mail", 1896, "Alfred Harmsworth", "England"));
		library.stockAdd(new Newspaper("Wall Street Journal", 1889, "Charles Dow", "America"));
		library.stockAdd(new Newspaper("El Pais", 1996, "Jose Sporttorno", "Spain"));	

		System.out.println(library);
	}
	
	}
