import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\Emadul\\workspace\\BddCucumber\\login.feature"}, format = {"json:target/cucumber.json"})
public class Runner {

}
