package runner;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(features={
//"src/test/java/features/Login.feature",
"src/test/java/features/CreateLead.feature"},
				glue={"steps"},
				monochrome=true,
				publish=true)
//				tags="not @sanity",
//		tags="@Sanity or @Smoke")
public class Runner extends AbstractTestNGCucumberTests{


	
}
