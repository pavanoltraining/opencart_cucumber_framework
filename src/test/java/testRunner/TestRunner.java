package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                //features= {".//Features/"},
                features= {".//Features/Login.feature"},
                //features= {".//Features/LoginDDT.feature"},
                //features= {".//Features/LoginDDTExcel.feature"},
                //features= {".//Features/Login.feature",".//Features/AccountRegistration.feature"},
                //features="@target/rerun.txt",   // Runs only failures
                glue="stepDefinitions",
                plugin= {"pretty",
                        "html:reports/myreport.html",
                        "json:reports/myreport.json",
                        "rerun:target/rerun.txt",    //Mandatory to capture failures
                },
                dryRun=false,
                monochrome=true,
                tags = "@sanity"	//Scenarios tagged with @sanity,
                //tags = "@sanity and @regression"	//Scenarios tagged with both @sanity and @regression
                //tags = "@sanity or @regression"	 //Scenarios tagged with either @sanity or @regression
                //tags = "@sanity and not @regression", //Scenarios tagged with @sanity but not tagged with @regression

        )

public class TestRunner {

}

