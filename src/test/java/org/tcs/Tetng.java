package org.tcs;

import org.testng.annotations.Test;

public class Tetng {
@Test(priority = -5)
private void tc0() {
System.out.println("method 1");
}
@Test(priority = 3)
private void tc1() {
System.out.println("method 2");
}
@Test(priority = 5)
private void tc2() {
System.out.println("method 3");
}
@Test(invocationCount = 4)
private void tc3() {
System.out.println("method 4");
}
@Test(enabled = false)
private void tc4() {
	System.out.println("method 5");
}

}
