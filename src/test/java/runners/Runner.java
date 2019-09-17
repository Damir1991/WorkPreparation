package runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="\\src\\test\\resourses\\Features",            //the path of feature file
glue="src\\test\\java\\Steps",                                  //the path of Step Definition file
tags="",                                                   // What tags in the feture file should be executed
dryRun=true,                                              // Checks if all Steps have Step Definition
monochrome=true                                          // Display the output console in more readable way
  )







public class Runner {
	
}
