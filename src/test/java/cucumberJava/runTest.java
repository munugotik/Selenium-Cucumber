package cucumberJava;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/cucumber", "json:target/cucumber/report.json", "junit:target/cucumber/junit.xml" })
//@Cucumber.Options(glue = {"classpath:com/rd/uat"}, strict = true, format = { "pretty", "html:target/cukes", "json:target/cukes/report.json", "junit:target/cukes/junit.xml"}) 
public class runTest {
	
}