package org.tcs;

import org.testng.annotations.DataProvider;

public class Provider2 {
	@DataProvider(name="Data")
	public static Object[][] get() {
	return new Object[][]
			{
		{"Dinesh","Kumar"},{"Java","selenium"},{"sdj","dhf"}
	};
	}
}
