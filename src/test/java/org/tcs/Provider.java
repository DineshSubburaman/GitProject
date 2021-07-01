package org.tcs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider {

@Test(dataProvider="Data",dataProviderClass=Provider2.class)
private void tc0(String s,String s1) {
System.out.println(s);
System.out.println(s1);
}
}