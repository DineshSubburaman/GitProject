package org.tcs;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Suite1.class,Suite2.class})
public class SuiteLevelExecution {
public static void main(String[] args) {
	Result runClasses = JUnitCore.runClasses(SuiteLevelExecution.class);
	int runCount = runClasses.getRunCount();
	System.out.println(runCount);
	int ignoreCount = runClasses.getIgnoreCount();
	System.out.println(ignoreCount);
	List<Failure> failures = runClasses.getFailures();
	for (int i = 0; i <failures.size(); i++) {
		String string = failures.get(i).toString();
		System.out.println(string);
	}
	int failureCount = runClasses.getFailureCount();
	System.out.println(failureCount);
}	
}
