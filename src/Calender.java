import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Calender  {

//	SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
//	//SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//	Date date = sdf.parse(dateInString);
//	System.out.println(date);
//	
	
	public static void main(String[] args) {  
		   Calendar calendar = Calendar.getInstance() ;
		   // . get instance is used to get a calendar using the default time zone 

		   System.out.println("The current date is : " + calendar.getTime());  
		   calendar.add(Calendar.DATE, -30);  
		   System.out.println("30 days ago: " + calendar.getTime());  
		   calendar.add(Calendar.MONTH, 6);  
		   System.out.println("6 months later: " + calendar.getTime());  
		   calendar.add(Calendar.YEAR, 5);  
		   System.out.println("5 years later: " + calendar.getTime());  
		   
		   }  
}
