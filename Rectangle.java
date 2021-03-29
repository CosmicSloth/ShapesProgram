
public class Rectangle extends Shape {   
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {     // Constructor Method
		this.length = length;
		this.width = width;
	}
	
	public double computeArea() {
		return length * width;
	}
	
	public String getShapeType() {
		return "Rectangle";
	}


	}
	
