package org.tcs;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Suite2 {
	@Test
	public void suiteTest4() {
		System.out.println("Suitest4");
	}
	@Ignore
	@Test
	public void suiteTest5() {
		System.out.println("Suitest5");
	}
	@Test
	public void suiteTest6() {
		System.out.println("Suitest6");
		Assert.assertTrue(false);
	}
}
