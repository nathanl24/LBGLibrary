package data;

public class Map extends Product{

	private String continent;
	
	public Map() {
			super();
	}
	
	public Map(String name, int release, String author, String continent) {
		super(name, release, author);
		this.continent = continent;
	}
	
	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}	
	
	public int compareTo(Product p) {
		return 0;
	}
}