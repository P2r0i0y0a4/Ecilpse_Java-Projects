package java_practice;

public class Phoni {
	private String model;
	private String colour;
	private int price;
	private Siim s=new Siim();
	public Siim getS() {
		return s;
	}
	public void setS(Siim s) {
		this.s=s;
	}
	External_Memory e;
	
	public void addExternal_Memory() {
		e=new External_Memory();
	}
	public External_Memory getE() {
		return e;
	}
	public void setE(External_Memory e) {
		this.e=e;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}
