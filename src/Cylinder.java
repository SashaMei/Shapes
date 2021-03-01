
public class Cylinder  implements Shape,ThreeDimensionalShapes {
	private double radius, height, area, volume ;
	double pi = Math.PI;
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;	
	}
	
	public double getRadius() {
		return radius;
	}
	public double height() {
		return height;
	}
	
	@Override 
	public double calculateArea() {
		
		return area = 2*(2* pi*radius * radius) + ((2* pi *radius)*height);
	}
	
	@Override
	public double calculateVolume() {
		return volume = 2*(2* pi*radius * radius)*height;	
	}
	
	@Override 
	public String toString() {
		String s = "Cynlinder	Radius: "+radius +"		Height:"+height;
		return s;
	}
	
	@Override
	public String getDescription() {
		String s = "Cylinder: A solid geometric figure with straight parallel sides and a circular or oval cross section ";
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cylinder) {
			Cylinder anotherCylinder = (Cylinder)obj;
			return Math.abs(radius- anotherCylinder.radius)<0.0001 && ( Math.abs(height - anotherCylinder.height)<0.0001);
		}else {
			return false;
		}
	}
	@Override
	public boolean isPartOfShape(Object o) {
		Circle cylinderCircle = new Circle(getRadius());
		Circle c;
		if(o instanceof Circle)
		{
			c = (Circle) o;
			
		
			return cylinderCircle.equals(c);
		}
		return false;
	}

}
