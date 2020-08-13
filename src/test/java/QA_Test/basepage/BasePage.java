package QA_Test.basepage;

import QA_Test.infrastructure.driver.Wait;
import QA_Test.infrastructure.driver.Setup;
import org.openqa.selenium.WebDriver;
public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
