package library;

import java.util.ArrayList;
import java.util.List;
import data.Product;


public class Library {

	private ArrayList<Product> products = new ArrayList<>();
	private ArrayList<Person> people = new ArrayList<>();

	
	public boolean stockAdd(Product p) {
		return this.products.add(p);
	}

	public boolean stockRemove(Product p) {
		return this.products.remove(p);
	}	
	
	public boolean checkInById(int id) {
		for (Product product : this.products) {
			if (product.getId() == id) {
				return product.setCheckedIn(true);
			}
		}
		return false;
	}

	public boolean checkoutById(int id) {
		for (Product product : this.products) {
			if (product.getId() == id) {
				return product.setCheckedIn(false);
			}
		}
		return true;
	}

	public boolean amendById(String name, int release, String author, int id) {
		for (Product product : this.products) {
			if (product.getId() == id) {
				product.setName(name);
				product.setRelease(release);
				product.setAuthor(author);
				return true;
			}
		}
		return false;
	}
}