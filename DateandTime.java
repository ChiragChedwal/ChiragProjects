package Constructor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy ");
		System.out.println(sdf.format(d));
		
		System.out.println(d.toString());

	}

}
