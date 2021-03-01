import java.util.*;

public class ShapeTester {
	public static boolean bigger = true;

	public static void main(String[] args) {
		

		Rectangle rectangle1 = new Rectangle(3,4);
		Rectangle rectangle2 = new Rectangle(4,3);
		Rectangle rectangle3 = new Rectangle(5,6);
		Square square1 = new Square(2);
		Square square2 = new Square(4);
		Square square3 = new Square(4);
		Circle circle1 = new Circle(3);
		Circle circle2 = new Circle(5);
		Cylinder cylinder1 = new Cylinder(3, 5);
		Cylinder cylinder2 = new Cylinder(4, 6);
		Cylinder cylinder3 = new Cylinder(6, 4);
		Cube cube1 = new Cube(2);
		Cube cube2 = new Cube(3);
		
		List<Shape> shapeList = new ArrayList<>();
		shapeList.add(rectangle1);
		shapeList.add(rectangle2);
		shapeList.add(rectangle3);
		shapeList.add(square1);
		shapeList.add(square2);
		shapeList.add(square3);
		shapeList.add(circle1);
		shapeList.add(circle2);
		shapeList.add(cylinder1);
		shapeList.add(cylinder2);
		shapeList.add(cylinder3);
		shapeList.add(cube1);
		shapeList.add(cube2);

		System.out.println("*****PRINTING OUT THE TEXT REPRESENTATION, DESCRIPTION, AREA, AND PERIMETER/VOLUME OF EACH SHAPE");
		for(Shape shape : shapeList) {
			System.out.println(shape);
			System.out.println(shape.getDescription());
			System.out.println("\tArea: " + shape.calculateArea());
			
			// CODE MISSING: PRINT THE PERIMETER OF TWO-DIMENSIONAL SHAPES
			if(shape instanceof TwoDimensionalShapes) {
				System.out.println("\tPerimeter: "+((TwoDimensionalShapes) shape).calculatePerimeter());
			}
		
			// CODE MISSING: PRINT THE VOLUME OF THREE-DIMENSIONAL SHAPES
			if (shape instanceof ThreeDimensionalShapes) {
				System.out.println("\tVolume: "+((ThreeDimensionalShapes)shape).calculateVolume());
			}
			System.out.println("");
		}


		System.out.println("\n*****PRINTING ALL EQUAL, NON-ALIAS SHAPES");
		for(Shape firstShape : shapeList) {
			for(Shape secondShape : shapeList) {
				// CODE MISSING: TEST IF THE TWO SHAPES ARE EQUAL (BUT NOT ALIASES!) PRINT THE SHAPES
				if (firstShape == secondShape) {}//"==" Can be used to compare two objects memory addresses
				else if (firstShape.equals(secondShape)) {
					System.out.println("Equal shapes found:" + "\n\t"+firstShape+"\n\t"+secondShape );
				
				}
			}
		}
	

		System.out.println("\n*****PRINTING ALL CUBE/SQUARE COMBINATIONS WHERE THE SQUARE IS A SIDE FOR THE CUBE");
		for(Shape firstShape : shapeList) {
			for(Shape secondShape : shapeList) {
				// CODE MISSING: TEST THE isTopOrBottom METHOD FOR SQUARE/CUBE COMBINATIONS. PRINT ANY MATCHES FOUND.
				if(firstShape instanceof Cylinder && secondShape instanceof Circle) {
					if(((Cylinder)firstShape).isPartOfShape((Circle)secondShape)) {
						System.out.println(firstShape+"\n"+ secondShape );
					}
					
				}
				if(firstShape instanceof Cube && secondShape instanceof Square) {
					if(((Cube)firstShape).isPartOfShape((Square)secondShape)) {
						System.out.println(firstShape+"\n"+ secondShape );
					}
					
				}
				
			}
		}
		

		System.out.println("\n*****PRINTING ALL COMBINATIONS OF TWO-DIMENSIONAL SHAPES THAT CAN FIT INSIDE ANOTHER");
		for(Shape firstShape : shapeList) {
			for(Shape secondShape : shapeList) {
				if (canFitInside(firstShape,secondShape)) {
					System.out.println("Nested Shapes Found: ");
					if(bigger){
						System.out.println("Outer: "+firstShape + "\nInner: "+secondShape+ "\n");	
					}else {
						System.out.println("Outer: "+secondShape+ "\nInner: "+firstShape +"\n");
					}
				}
				
				// EXTRA CREDIT: TEST THE canFitInside METHOD FOR PAIRS OF TWO DIMENSIONAL SHAPES. PRINT ANY SHAPES THAT NEST.
				
			}
		}
		
	}//end main

	public static boolean canFitInside(Object obj1, Object obj2) {
		if(obj1 instanceof Square && obj2 instanceof Square) {
		    Square s1 = (Square) obj1;
		  
			if(!((Square)obj1).equals((Square)obj2)) {
				
				if(((Square)obj1).calculatePerimeter()<((Square)obj2).calculatePerimeter()) {
					bigger = false;
					return true;
					
				}else {
					bigger = true;
					return true;
				}		
			}
			return false;
		}else if(obj1 instanceof Square && obj2 instanceof Rectangle){
			if(!((Square)obj1).equals((Rectangle)obj2)) {
				if(((Square)obj1).calculatePerimeter()<((Rectangle)obj2).calculatePerimeter()) {
					bigger = false;
					return true;
				}else {
					bigger = true;
					return true;
				}
			}
			return false;
		}else if(obj1 instanceof Square && obj2 instanceof Circle){
			if(!((Square)obj1).equals((Circle)obj2)) {
				if(((Square)obj1).calculatePerimeter()<((Circle)obj2).calculatePerimeter()) {
					bigger = false;
					return true;
				}else {
					bigger = true;
					return true;
				}
				
			}
			return false;
		}else if(obj1 instanceof Rectangle && obj2 instanceof Rectangle){
			if(!((Rectangle)obj1).equals((Rectangle)obj2)) {
				if(((Rectangle)obj1).calculatePerimeter()<((Rectangle)obj2).calculatePerimeter()) {
					bigger = false;
					return true;
				}else {
					bigger = true;
					return true;
				}
			}
			return false;
		}else if (obj1 instanceof Rectangle && obj2 instanceof Circle){
			if(!((Rectangle)obj1).equals((Circle)obj2)) {
				if(((Rectangle)obj1).calculatePerimeter()<((Circle)obj2).calculatePerimeter()) {
					bigger = false;
					return true;
				}else {
					bigger = true;
					return true;
				}
			}
			return false;
		}else if (obj1 instanceof Circle && obj2 instanceof Circle){
			if(!((Circle)obj1).equals((Circle)obj2)) {
				if(((Circle)obj1).calculatePerimeter()<((Circle)obj2).calculatePerimeter()) {
					bigger = false;
					return true;
				}else {
					bigger = true;
					return true;
				}
			}
			return false;
		}else {
				return false;
			}
		}
	
		
	
}//end class
