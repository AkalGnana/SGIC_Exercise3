package Exercise_3;

//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qu_4 {

	// (A) String covert to date
	public static Date Stringdtodate(String dates) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date date = format.parse(dates);
			return date;

		} catch (Exception e) {
			return null;

		}

	}

	// (B) isNullorEmpty
	public static boolean isNullorEmpty(String st) {
		if (st == null || st.isEmpty()) {
			return false;
		}
		return true;

	}

	// (C)RemoveZero
	public static String removezero(String st) {
		String str = "^0+(?!$)";
		st = st.replaceAll(str, "");
		return st;
	}

	// (D)AlphaNumeric
	public static boolean AlphaNumeric(String st) {
		String regex = "^[a-zA-Z0-9]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(st);
		return matcher.matches();

	}

}