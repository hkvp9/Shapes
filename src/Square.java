
public class Square extends Shape {

		public int side; 
		
		@Override
		
		public void calculateArea(){
			double area = Math.pow(side, 2);
			System.out.println("The area of a Square is " + area);
			
		}



}
