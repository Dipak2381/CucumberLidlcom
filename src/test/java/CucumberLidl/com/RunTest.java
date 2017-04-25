package CucumberLidl.com;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by DIPAK on 4/24/2017.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features=".",format="html:target/Cucumber.Reports",tags="@QueenTest")
public class RunTest {
}
