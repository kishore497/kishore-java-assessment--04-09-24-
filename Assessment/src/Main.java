import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.print("Choose a shape(Circle or Rectangle): ");
			Scanner s = new Scanner(System.in);
			String shape = s.nextLine();
			String cls = "Circle";
			if(shape.equals(cls)) {
				System.out.print("Enter the radius of the circle: ");
				double radius = s.nextDouble();
				Circle c = new Circle(radius);
				System.out.println(c.getClass());
				System.out.println(c.area());
				System.out.println(c.perimeter());
			}else {
				System.out.print("Enter the height of the Rectangle: ");
				double height = s.nextDouble();
				System.out.print("Enter the width of the Rectangle: ");
				double width = s.nextDouble();
				Rectangle r = new Rectangle(height, width);
				System.out.println(r.getClass());
				System.out.println(r.area());
				System.out.println(r.perimeter());
			}
			
		}

	}

}
