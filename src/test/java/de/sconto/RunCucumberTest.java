package de.sconto;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-report.json", "pretty"},
        features = "src/test/resources/de.sconto",
        tags = "@login",//"@wrong",
        strict = true)

public class RunCucumberTest {

}


