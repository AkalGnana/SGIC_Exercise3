package Exercise_3;

public class Qu_2 {

	public static void main(String[] args) {
		String a = "apple,orange,strawberry,banana";
		char[] a1 = a.toCharArray();
		String b[] = { "", "", "", "" };

		for (int j = 0; j < b.length; j++) {
			for (int i = 0; i < a1.length; i++) {

				if (a1[i] != ',') {

					b[j] += a1[i];
				} else {
					j++;
				}
			}
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// Do this by using java in build string functions,

//		String a= " atul ,  singh Java , computer science and engineering , Data structures & algorithms ";
//		String b[]= a.split(",");
//		String c = "";
//		for(int i=0;i<b.length;i++){
//		  c+=b[i].trim()+",";
//		}
//		System.out.println(c.substring(0,c.length()-1));
//		
	}

}
