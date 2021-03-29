import java.util.*;
public class TestShapes {
	
	public static void main(String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();

		Scanner in = new Scanner(System.in);
		boolean loopControl = false; 			//Loop stops when true; starts again when false
		String choice = in.next();

		do {
			loopControl = false;
			System.out.println("Available Shapes: \nRectangle\nSquare\nTriangle\nCircle");
			System.out.println("Select a shape type, or Q to display areas and exit program.");
		
		
		//Rectangle
			
			
			if(choice.equals("Rectangle") || choice.equals("rectangle")) {
				loopControl = false;
				System.out.println("Enter length of rectangle.");
				double length = in.nextDouble();
				System.out.println("Enter width of rectangle.");
				double width = in.nextDouble();
				shapes.add(new Rectangle(length, width));
			}
			
		//Square
			else if(choice.equals("Square") || choice.equals("square")) {
				loopControl = false;
				System.out.println("Enter side of square.");
				double side = in.nextDouble();
				shapes.add(new Square(side));
			}
			
		//Triangle
			else if(choice.equals("Triangle") || choice.equals("triangle")) {
				loopControl = false;
				System.out.println("Enter base of triangle.");
				double base = in.nextDouble();
				System.out.println("Enter height of triangle.");
				double height = in.nextDouble();
				shapes.add(new Triangle(base, height));
			}
			
		//Circle
			else if(choice.equals("Circle") || choice.equals("circle")) {
				loopControl = false;
				System.out.println("Enter radius of circle.");
				double radius = in.nextDouble();
				shapes.add(new Circle(radius));
			} 
		
			
		//Error Message
			else {
				loopControl = false;
				System.out.println("Error: Invalid selection.");
			}
			
			
			
		if (choice.equals("q") || choice.equals ("Q")) {
			loopControl = true;		//Stop loop
			System.out.println("Computing area for selected shapes: \n");
		}
		
		for(int i = 0; i < shapes.size(); i++) {
			System.out.println("\n Area for " + shapes.get(i).getShapeType() + " = " + shapes.get(i).computeArea());
		}
		
		} while(!loopControl);
}
}
 