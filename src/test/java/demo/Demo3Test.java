package demo;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demoApplication.GenericUtility.BaseClass;
import demoApplication.GenericUtility.ListenersImplementationClass;

@Listeners(ListenersImplementationClass.class)
public class Demo3Test extends BaseClass{
	
	@Test(groups ="SmokeSuite")
	public void sample1Test() {
		Reporter.log("Demo3-Sample1-Smoke",true);
	}
	@Test(groups ="RegressionSuite")
	public void sample2Test() {
		Reporter.log("Demo3-Sample2-Regression",true);
	}
	@Test
	public void dsample3Test() {
		Reporter.log("Demo3-Sample3-NoSmoke-NoRegression",true);
	}
	@Test
	public void sample4Test() {
		Reporter.log("Demo3-Sample4-RegionalRegression",true);
	}

}
