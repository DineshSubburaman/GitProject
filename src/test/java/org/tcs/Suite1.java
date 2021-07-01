package org.tcs;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Suite1 {
@Test
public void suiteTest() {
	System.out.println("Suitest");
	Assert.assertTrue(false);
}
@Test
public void suiteTest2() {
	System.out.println("Suitest2");
}
@Ignore
@Test
public void suiteTest3() {
	System.out.println("Suitest3");
}
}
