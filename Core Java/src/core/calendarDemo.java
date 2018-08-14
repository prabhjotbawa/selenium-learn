package core;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) {

Calendar cal = Calendar.getInstance();

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

System.out.println(sdf.format(cal.getTime()));
System.out.println(cal.get(Calendar.DAY_OF_WEEK));

	}

}
