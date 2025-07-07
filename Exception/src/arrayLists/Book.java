package arrayLists;

public class Book implements Comparable{
	String title;
	String author;
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	@Override
	public int compareTo(Object o) {
		Book b=(Book)o;
		return this.author.compareTo(b.author);
	}
	@Override
	public String toString() {
		return "[ Title ="+title +", Author="+author+"]";
	}
	@Override
	public boolean equals(Object o) {
		Book b=(Book)o;
		if(this.title.equals(b.title) && this.author.equals(b.author)) {
			return true;
		}
		return false;
	}

}
