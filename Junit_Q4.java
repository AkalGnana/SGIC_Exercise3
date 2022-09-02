package Exercise_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit_Q4 {

	@Test
	public void removeZr() {
		JunitTesting removeZr = new JunitTesting();
		String output = removeZr.removezero("0001547");
		assertEquals("1547", output);

	}

	@Test
	public void isNullorEmpty() {
		JunitTesting isNullorEmpty = new JunitTesting();
		boolean output = isNullorEmpty.isNullorEmpty("hgfygfyuguy");
		assertEquals(true, output);
	}

//		@Test
//		public void converdate() {
//			JunitTesting converdate=new JunitTesting();
//			Date output=converdate.Stringdtodate("19/05/2021");
//			assertEquals(Thu May 05 00:00:00 IST 2022,output);
//		}

	@Test
	public void AlphaNumeric() {
		JunitTesting AlphaNumeric = new JunitTesting();
		boolean output = AlphaNumeric.AlphaNumeric("hgdyugef");
		assertEquals(true, output);

	}
}
