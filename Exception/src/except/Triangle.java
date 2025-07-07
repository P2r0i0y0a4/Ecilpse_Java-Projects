package except;

public class Triangle {
	private static int length;
	private static int breadth;
	private static int height;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public static int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public static int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public static int getPerimeter(Triangle t) {
		return t.length+t.breadth+t.height;
	}
	public static double getArea(Triangle t) {
		return (0.5*t.getBreadth()*t.getHeight());
	}
	

}
