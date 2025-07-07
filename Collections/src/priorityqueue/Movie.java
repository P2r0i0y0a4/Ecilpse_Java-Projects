package priorityqueue;

public class Movie implements Comparable{
	String movie_name;
	String actor_name;
	int ticket_Price;
	public Movie(String movie_name, String actor_name, int ticket_Price) {
		super();
		this.movie_name = movie_name;
		this.actor_name = actor_name;
		this.ticket_Price = ticket_Price;
	}
	@Override
	public boolean equals(Object o) {
		Movie m=(Movie)o;
		return this.ticket_Price==m.ticket_Price;
	}
	@Override
	public int compareTo(Object o) {
		Movie m=(Movie)o;
		if(this.ticket_Price>m.ticket_Price) return 1;
		else if(this.ticket_Price==m.ticket_Price) return 0;
		else return -1;
	}
	@Override
	public String toString() {
		return " [movie_name=" + movie_name + ", actor_name=" + actor_name + ", ticket_Price=" + ticket_Price
				+ "]";
	}
	
}
