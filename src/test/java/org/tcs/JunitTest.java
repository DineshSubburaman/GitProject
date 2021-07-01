package org.tcs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest {


	@BeforeClass
	public static void beforeclass() {
		System.out.println("Before class");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("After class");
	}
	@Before
	public void before() {
		System.out.println("Before");
	}
	@After
	public void after() {
		System.out.println("After");
	}
@Test
public void test() {
	System.out.println("test");
}
@Test
public void test1() {
	System.out.println("test1");
}
@Test
public void test3() {
	System.out.println("test3");
}
@Test
public void test2() {
	System.out.println("test2");
}
@Ignore
@Test
public void test4() {
	System.out.println("test 4");
}
}
