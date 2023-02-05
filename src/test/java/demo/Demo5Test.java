package demo;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demoApplication.GenericUtility.ListenersImplementationClass;


@Listeners(ListenersImplementationClass.class)
public class Demo5Test {
	
	@Test
	public void sample1Test() {
		Reporter.log("Demo5-Sample1",true);
	}
	@Test
	public void sample2Test() {
		Reporter.log("Demo5-Sample2",true);
	}
	@Test
	public void dsample3Test() {
		Reporter.log("Demo5-Sample3",true);
	}
	@Test
	public void sample4Test() {
		Reporter.log("Demo5-Sample4",true);
	}

}
