package Constructor;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal = Calendar.getInstance();
SimpleDateFormat sd = new SimpleDateFormat("d/M/yyy hh:mm:ss");
System.out.println(sd.format(cal.getTime()));
System.out.println(cal.get(Calendar.DAY_OF_MONTH));
System.out.println(cal.get(Calendar.HOUR));
System.out.println(cal.get(Calendar.AM_PM));

	}

}
