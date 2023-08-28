package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\test\\resources\\Login\\Login.feature"},glue= {"Stepdefinition"})  //Stepdefinition is the package name here
public class Test_runner extends AbstractTestNGCucumberTests{
	

}
