
public class Triangle extends Shape {

	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		
		this.base = base;
		this.height = height;
		
	}
	
	public double computeArea() {
		return ((height * base) / 2);
	}
	
	public String getShapeType() {
		return "Triangle";
	}
	
}


