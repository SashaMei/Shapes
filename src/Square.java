
public class Square implements Shape, TwoDimensionalShapes{
	private double sideLength, perimeter, area;
	
	public Square(double sideLength) {
		this.sideLength = sideLength;
		
	}
	
	public double getSideLength() {
		return sideLength;
	}
	
	public void setSideLength(double sideLength) {
		if (sideLength > 0) {
			this.sideLength= sideLength;
		}
	}
	@Override
	public double calculatePerimeter() {
		perimeter = sideLength * 4;
		return perimeter;
	}
	
	@Override
	public double calculateArea() {
		area= sideLength * sideLength;
		return area;
	}
	
	@Override
	public String toString() {
		String s = "Square "+ "Side Length: " + sideLength;
		return s;
	}
	
	@Override 
	public String getDescription() {
		String s = "Rectangle: A quadrilateral with four right angles"+"\nSquare: A quadrilateral with four equal sides and four equal angles";
		return s;
	}
	
	@Override 
	public boolean equals(Object obj){
		if(obj instanceof Square) {
			Square anotherSquare = (Square)obj;
			if( Math.abs(sideLength-anotherSquare.sideLength)<0.0001) {
				return true;
			}

			return false;
		}else {
			return false;
		}
	}
	
	

}
