package data;

public class Product {

	private String name;
	
	private int release;
	
	private String author;
	
	public Product() {
		super();
	}
	
	public Product(String name, int release, String author) {
		super();
		this.name = name;
		this.release = release;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRelease() {
		return release;
	}

	public void setRelease(int release) {
		this.release = release;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
