package data;

public class Book extends Product {
	
	private String category;
	
	public Book() {
			super();
	}
	
	public Book(String name, int release, String author, String category) {
		super(name, release, author);
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}	

	public int compareTo(Product p) {
		return 0;
	}
}