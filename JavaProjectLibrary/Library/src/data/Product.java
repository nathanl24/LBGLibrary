package data;

public class Product {

	private String name;
	
	private int release;
	
	private String author;
	
	private int id;
	
	private boolean checkedIn;
	
	private static int count = 1;
	
	public Product() {
		super();
		this.id = count++;
		this.checkedIn = true;
	}
	
	public Product(String name, int release, String author) {
		super();
		this.id = count++;
		this.checkedIn = true;
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public boolean isCheckedIn() {
		return checkedIn;
	}

	public boolean setCheckedIn(boolean checkedIn) {
		return this.checkedIn = checkedIn;
	}
	
	public String toString() {
		return "Product Name" + name + ", Release=" + release + ", author=" + author
				+ ", id=" + id + ", checkedIn=" + checkedIn;
	}
}
