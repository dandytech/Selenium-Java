package javaOOPBasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class dateCalandar {

	@Test
	public void datePract() {
		
		//To print date, time and year
		Date d = new Date();
		System.out.println(d.toString());
		
		//to formate date
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));	

	}
	
	@Test
	public void calendarPract()
	{
		//Calendar
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd =new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//Calendar class has more features/methods than Date class 
			
	}

}
