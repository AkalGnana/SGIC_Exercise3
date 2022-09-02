package Exercise_3;

public class Qu_1 {

	public static void main(String[] args) {

		String a = "Some extra spaces";
		String b = "";

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != ' ') {
				b += a.charAt(i);
			} 
			
		}

		System.out.println(b);

		// with string function
		String c = "Some extra spaces";

		System.out.println(c.replaceAll("\\s", ""));
	}

}
