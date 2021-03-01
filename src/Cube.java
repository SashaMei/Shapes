
public class Cube implements Shape,ThreeDimensionalShapes {
	private double sideLength, area, volume;
	
	public Cube(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double getsideLength() {
		return sideLength;
	}
	
	public double calculateArea() {
		return area = (sideLength* sideLength)*6;
	}
	@Override
	public double calculateVolume() {
		return volume = calculateArea()* sideLength;
	}
	
	@Override
	public String toString() {
		String s = "Cube	Side Length: "+sideLength;
		return s;
	}
	
	@Override
	public String getDescription() {
		String s = "Cube: A three-dimensional solid object bounded by six square faces with three meeting at each vertex";
		return s;			
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cube) {
			Cube anotherCube = (Cube)obj;
			return Math.abs(sideLength - anotherCube.sideLength)<0.0001;
		}else {
			return false;
		}
	}
	@Override
	public boolean isPartOfShape(Object c) {
		Square cubeSquare = new Square(sideLength);
		Square s; 
		if (c instanceof Square) {
			s = (Square) c;
			return cubeSquare.equals(s);
		}else {
			return false;
		}
		
	}

}
