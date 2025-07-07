package java_practice;

public class ECar {
	private String model;
	private String colour;
	private int price;
	private ERadio r;
	public void addRadio() {
		setR(new ERadio());
	}
	private EEngine e=new EEngine();
	
	public EEngine getE() {
		return e;
	}
	public void setE(EEngine e) {
		this.e = e;
	}
	public ERadio getR() {
		return r;
	}
	public void setR(ERadio r) {
		this.r = r;
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
