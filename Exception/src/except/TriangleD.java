package except;
class TriangleD{
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.setLength(5);
		t.setBreadth(3);
		t.setHeight(4);
		System.out.println(Triangle.getPerimeter(t));
		System.out.println(Triangle.getArea(t));
	}
}
