
public class Rectangle implements Shape {
	
	private double heigth;
	
	private double width;
	
	public Rectangle(double height, double width) {
		this.heigth = height;
		this.width = width;
	}

	@Override
	public double area() {
		
		return this.heigth * this.width;
	}

	@Override
	public double perimeter() {
		
		return 2 * (this.heigth + this.width);
	}

	@Override
	public String getName() {
		
		return "Rectangle";
	}

}
