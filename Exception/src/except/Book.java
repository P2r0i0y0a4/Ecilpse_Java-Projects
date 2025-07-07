package except;

public class Book implements Comparable{
	private int price;
	private String author;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int compareTo(Object o) {
		Book b=(Book)o;
		if(this.getPrice()<b.getPrice()) 
			return -1;
		else if(this.getPrice()==b.getPrice())
			return 0;
		else
			return 1;
	}
	public String toString() {
		return "[Price : "+this.getPrice()+",Author Name : "+this.getAuthor()+"]";
	}
}
