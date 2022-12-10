package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/resources/login/login.feature"},glue= {"step1_defination"},tags="@PositiveTesting")
public class test_cucumber  extends AbstractTestNGCucumberTests{



}
