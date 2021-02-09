package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// PAGE FACTORY version - make sure to comment out code in POM step defintion if using this one
public class GoogleSearchPage_PF {

    WebDriver driver = null;
    //    constructor
    public GoogleSearchPage_PF(WebDriver driver) {
        //       use the webdriver passed in from test instance
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //    locator
    @FindBy(name = "q")
    @CacheLookup  // store element in memory to speed up; use carefully!
    WebElement search_txt;

    // Helper method
    public void enter_search_term(String search_term){

        search_txt.sendKeys(search_term);
    }
}
