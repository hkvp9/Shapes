import java.util.Set;


public class Test {

	public static void main(String[] args) {
		Shape s = new Shape(  );
		Circle c = new Circle (  );	
		c.radius = 8; 
		
		
		
		s.calculateArea();
		Square sq = new Square(  );
		sq.side = 15;
		sq.calculateArea();
		
		
		//Creating the triangle object
		Triangle t = new Triangle(  );
		t.height = 16;
		t.base = 23;
		t.calculateArea();
		
		
		
		
	}
}
