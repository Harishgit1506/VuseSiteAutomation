package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature",glue={"/StepDefination","Helper"},
plugin= {"pretty","html:target/login-reports/cucumber1.html"}
,tags="@forgot")


public class RunnerVuse {

}
