
public class Rectangle implements Shape, TwoDimensionalShapes{
	private double width, height,area, perimeter;
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public double calculateArea() {
		return area = width * height;
	}
	
	@Override
	public double calculatePerimeter() {
		return perimeter = 2*(width + height);
	}
	@Override
	public String toString() {
		String s = "Rectangle " +"	Width "+ width +"	Height "+ height ;
		return s;
	}
	@Override
	public String getDescription() {
		String s = "Rectangle: A quadrilateral with four right angles" ;
		return s;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle anotherRectangle = (Rectangle) obj;
			if( (Math.abs(width-anotherRectangle.width)<0.0001 && Math.abs(height-anotherRectangle.height)<0.0001)) {
				return true;
			}else if(Math.abs(width-anotherRectangle.height)<0.0001&& Math.abs(height-anotherRectangle.width)<0.0001){
				return true;
				
			}else{
				return false;
			}
		}else {
			return false;
		}
	}

}
