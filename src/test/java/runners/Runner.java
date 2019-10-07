package runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resourses\\Features",            //the path of feature file
glue="Steps",                                  //the path of Step Definition file
tags= {"@Positive"},                                                   // What tags in the feture file should be executed
dryRun=false,                                              // Checks if all Steps have Step Definition
monochrome=true                                          // Display the output console in more readable way
  )







public class Runner {
	
}
