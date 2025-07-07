package treemap;

public class Store implements Comparable{
	String storeName;
	String address;
	String owner;
	public Store(String storeName, String address, String owner) {
		this.storeName = storeName;
		this.address = address;
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", address=" + address + ", owner=" + owner + "]";
	}
	@Override
	public boolean equals(Object o) {
		Store s=(Store)o;
		return this.storeName==s.storeName;
	}
	@Override
	public int compareTo(Object o) {
		Store s=(Store)o;
		return this.storeName.compareTo(s.storeName);
	}
	

}
