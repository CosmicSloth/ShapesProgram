
public class Square extends Rectangle {  //extends means we are inheriting everything from Rectangle class
	
	public Square(double side) {
		super(side, side);  // Inherits computeArea() method from superclass Shape
	}
	
	public String getShapeType() {
		return "Square";
	}
}