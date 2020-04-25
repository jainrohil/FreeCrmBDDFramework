package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//the path of the feature files
		features = "C:\\Users\\dell\\eclipse-workspace\\FreeCrmBDDFramework\\FreeCrmBDDFramework\\src\\main\\java\\Features\\tagging.feature", 
				//the path of the step definition files
		glue={"StepDefinition"}, 
		//to generate different types of reporting
		plugin= {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},
		//display the console output in a proper readable format
		monochrome = true,
		//it will check if any step is not defined in step definition file
		strict = true,
		//to check the mapping is proper between feature file and step def file
		dryRun = true,
		
		tags = {"@SmokeTest,@RegressionTest"}// "@SmokeTest", "~@RegressionTest", "~@End2End"}		
		)


		//OR : tags = {"@SmokeTest,@RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
		//AND : tags = {"@SmokeTest","@RegressionTest"} - execute all tests tagged @SmokeTest AND @RegressionTest
		//Ignore a test tag: use '~' before the tag e.g. {"~@SmokeTest","@RegressionTest"}

public class TestRunner {

}
