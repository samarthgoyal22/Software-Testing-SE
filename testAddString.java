package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		String res=junit.addstring("Kshitij Gupta,","E20CSE163");
		assertEquals("Kshitij Gupta,E20CSE163",res);
	}

}
