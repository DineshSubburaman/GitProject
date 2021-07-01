package org.tcs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider3 {
	@DataProvider(name="Data")
	public static Object[][] get() {
	return new Object[][]
			{
		{"Dinesh","Kumar"},{"Java","selenium"},{"sdj","dhf"}
	};
	}
	@Test(dataProvider="Data")
	private void tc0(String s,String s1) {
	System.out.println(s);
	System.out.println(s1);
	}
}
