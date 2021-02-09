package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// POM - page
public class GoogleSearchPage {

    WebDriver driver;

    //    constructor
    public GoogleSearchPage(WebDriver driver) {
        //       use the webdriver passed in from test instance
        this.driver = driver;
//        verify google page title - should be Google
        if (!driver.getTitle().equals("Google")){
            throw new IllegalStateException("Google page title: " + driver.getTitle() + " does not match expected: Google");
        }
    }


    //    locators
    By search_txt = By.name("q");

    // Helper method
    public void enter_search_term(String search_term) {
        driver.findElement(search_txt).sendKeys(search_term);
    }
}
