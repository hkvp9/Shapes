import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class LearnDate {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.getTime()); 
		//milliseconds from midnight january 1st 1970

		Date date = new Date();
		DateFormat format = new SimpleDateFormat ("HH:MM");
		System.out.println(format.format(date));
//		System.out.println("HH:MM:SS");
	}
}
