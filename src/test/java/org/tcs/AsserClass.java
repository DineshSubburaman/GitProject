package org.tcs;

import org.junit.Assert;
import org.junit.Test;

public class AsserClass {
@Test
public void test() {
	String s="ABCD";
	System.out.println(s);
	Assert.assertEquals("aBCD", s);
	System.out.println("ABD");
	System.out.println("CDE");
}
@Test
public void test1() {
System.out.println("DINESH");
}
}
