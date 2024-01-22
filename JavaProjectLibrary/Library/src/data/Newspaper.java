package data;

public class Newspaper extends Product {

	private String country;
	
	public Newspaper() {
			super();
	}
	
	public Newspaper(String name, int release, String author, String country) {
		super(name, release, author);
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}	
	
	public int compareTo(Product p) {
		return 0;
	}
}