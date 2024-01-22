package library;

import java.util.ArrayList;
import java.util.List;
import data.Product;


public class Library {

	private ArrayList<Product> products = new ArrayList<>();

	public boolean stockAdd(Product p) {
		return this.products.add(p);
	}

	public boolean stockRemove(Product p) {
		return this.products.remove(p);
	}	
	
	
}
