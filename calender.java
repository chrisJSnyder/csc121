import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat; // from string to date and from date to string

public class calender {

	public static void main(String[] args) throws Exception {
		Date dt = new Date(999999999);
		Date dt2 = new Date(-999999999);

		SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss"); // setting input date formating form user

		Date myDate = df.parse("01-01-2001 21:34:57");

		System.out.println(myDate);

		System.out.println(System.currentTimeMillis());
		Date dt3 = new Date(dt2.getTime() - dt.getTime());// getTime() returns in milliseconds

		System.out.println(dt3);
		System.out.println(dt2.before(dt)); // after, before, & equals

		System.out.println(df.format((dt)));

		Calendar cal = Calendar.getInstance();

		System.out.println(cal);
		System.out.println(cal.get(Calendar.MONTH) == Calendar.NOVEMBER); // slide 23
		System.out.println(cal.get(13)); // field number thirteen is seconds

	}

}
