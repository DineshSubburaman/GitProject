package org.tcs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunAuto {
	@Test
	private void tc01() {
		System.out.println("method 1");
	}
	@Test
	private void tc02() {
		System.out.println("method 2");
	}
	@Test
	private void tc03() {
		System.out.println("method 3");
	}
	@Test
	private void tc04() {
		System.out.println("method 4");
	}
	@Test
	private void tc05() {
		System.out.println("method 5");
		Assert.assertTrue(false);
	}


}
