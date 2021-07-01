package org.tcs;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
@Test
private void tc0() {
	String str="adc";
SoftAssert assert1 = new SoftAssert();
assert1.assertEquals(str,"Adc");
	System.out.println(1);
	System.out.println(2);
}
@Test
private void tc9() {
	System.out.println("123");
}
}
