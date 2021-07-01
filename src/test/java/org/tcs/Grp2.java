package org.tcs;

import org.testng.annotations.Test;

public class Grp2 {
	@Test(groups = "@Retest")
	private void tc01() {
		System.out.println("method 1");
	}
	@Test(groups = "@Sanity")
	private void tc02() {
		System.out.println("method 2");
	}
	@Test(groups = "@Retest")
	private void tc03() {
		System.out.println("method 3");
	}
	@Test(groups = "@Sanity")
	private void tc04() {
		System.out.println("method 4");
	}
	@Test(groups = "@Smoke")
	private void tc05() {
		System.out.println("method 5");
	}
}
