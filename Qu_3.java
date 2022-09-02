package Exercise_3;

import java.sql.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Qu_3 {

	public static void main(String[] args) {
		
		Date dateBefore = new Date(2022, Calendar.MARCH,15);
		Date dateAfter = new Date(2022, Calendar.APRIL, 25);

		long dateBeforeInMs = dateBefore.getTime();
		long dateAfterInMs = dateAfter.getTime();

		long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);

		long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
		// Alternately: 
		// int daysDiff = (int) (timeDiff / (1000 * 60 * 60 * 24));
		System.out.println(" The number of days between dates: " + daysDiff);

		
		//A) Do this task without any java inbuilt functionality
		
		
	}

}
