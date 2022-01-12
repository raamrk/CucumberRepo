package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        
                
                features = ".//Features/TestNop.feature",
                glue="StepDefinitions",
                monochrome = true,
                plugin = {"pretty","html:CucumberTestReport"},
                
                dryRun = false,
                tags = {"@smoke"} //and operation
               // tags = {"@regression,@smoke" }	//or operation
                
                
                
                
                
        
        )


public class TestRun {

}
