package Interface;

public class Author {
	private String name;
	private String country;
	private int publishCount;
	public Author(String name, String country, int publishCount) {
		this.name = name;
		this.country = country;
		this.publishCount = publishCount;
	}
	public Author() {
		this.name="Ivan";
		this.country="Bulgaria";
		this.publishCount=1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPublishCount() {
		return publishCount;
	}
	public void setPublishCount(int publishCount) {
		this.publishCount = publishCount;
	}
	@Override
	public String toString() {
		return "Author name=" + name + ", country=" + country + ", publishCount=" + publishCount;
	}
}
