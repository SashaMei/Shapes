
public class Circle implements Shape, TwoDimensionalShapes {
	private double radius, perimeter, area;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	@Override
	public double calculatePerimeter() {
		return perimeter = 2* Math.PI * radius;
	}
	@Override 
	public double calculateArea() {
		return area = Math.PI* (radius* radius);
	}
	
	@Override 
	public String toString() {
		String s = "Circle	Radius: " + radius;
		return s;
	}
	
	@Override
	public String getDescription() {
		String s = "Circle:	A closed plane curve every point of which is equidistant from a fixed point within the curve ";
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle anotherCircle = (Circle)obj;
			return Math.abs(radius-anotherCircle.radius)<0.0001;
		}else {
			return false;
		}
	}
	
	

}
