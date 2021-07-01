package org.tcs;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSuit1
{
	@Parameters({"username","password"})
	@Test
	private void tc3(String s,String s1) {
		System.out.println(s);
	}
@Test
private void tc0() {
	System.out.println("method 0");
}
@Test
private void tc1() {
	System.out.println("method 1");
}
@Test
private void tc2() {
	System.out.println("method 2");
}
}
