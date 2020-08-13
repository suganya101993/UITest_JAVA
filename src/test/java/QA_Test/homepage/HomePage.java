package QA_Test.homepage;

import QA_Test.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    private static final String HOME_PAGE_URL = "https://podium-test-65804.firebaseapp.com/";

    @FindBy(css = "#app")
    private WebElement Page;

    @FindBy(css = "input[name=q]")
    private WebElement searchInput;

    @FindBy(css = "#app > div")
    private WebElement productList;

    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    void checkPageDisplay() {
        wait.forPageToBeDisplayed(5, this.Page);
    }

    void checkTitle(String title) {
        String displayedTitle = driver.getTitle();
        Assert.assertTrue("Displayed title is " + displayedTitle + " instead of " + title,
                title.equals(displayedTitle));
    }


    void searchFor(String searchValue) {
        this.searchInput.sendKeys(searchValue);
        this.searchInput.sendKeys(Keys.ENTER);
    }

    void productList(){
        wait.forPageToBeDisplayed(5,this.productList);
    }
}
