package one;

import java.util.Objects;

public class Book {
	String author;
	String title;
	int price;
	public Book(String author, String title, int price) {
		super();
		this.author = author;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Book b=(Book)obj;
		return this.author.equals(b.author);
	}
	@Override
	public int hashCode() {
		return Objects.hash(author);
	}

}
