package comparator;

public class Phone {
	private String brand;
	private int price;
	private int ram;
	private int camera;
	private String processor;
	
	public Phone(String brand, int price, int ram, int camera, String processor) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.camera = camera;
		this.processor = processor;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getCamera() {
		return camera;
	}
	public void setCamera(int camera) {
		this.camera = camera;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Employee[ Brand: "+ brand +"  Price: "+ price +" Ram: "+ ram +" Camera: "+ camera +" Processor: "+ processor +"]";
	}
}