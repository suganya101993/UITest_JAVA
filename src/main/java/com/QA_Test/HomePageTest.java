package com.QA_Test;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/QA_Test/sample/Home_page.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"com.QA_Test.sample.infrastructure.driver",
                "com.QA_Test.sample.homepage"})
public class HomePageTest {
}
