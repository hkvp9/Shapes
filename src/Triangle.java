
public class Triangle extends Shape {
	
	double base;
	double height;
	
	@Override
	
	public void calculateArea(){
		double area = (base*height)/2;
		System.out.println("The area of the Triangle is " + area);
	}
	

}
