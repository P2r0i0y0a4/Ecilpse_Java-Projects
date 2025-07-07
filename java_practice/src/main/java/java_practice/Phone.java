package java_practice;

public class Phone {
	private String model;
	private String colour;
	private int price;
	Sim s=new Sim();
	public Sim getS() {
		return s;
	}
	public void setS(Sim s) {
		this.s = s;
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
