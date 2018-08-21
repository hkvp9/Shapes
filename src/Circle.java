
public class Circle extends Shape {
	
	public int radius;
	@Override //When the parent class has a attribute the child has but needs to be different
	public void calculateArea(){
		//accessing maths's pi value
		double area = Math.PI * (Math.pow(radius, 2));
		System.out.println("Area of a circle is " + area);
		
	}

	
	
}
