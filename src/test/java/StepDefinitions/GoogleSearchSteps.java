package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("User is on Google Search Page")
    public void user_is_on_google_search_page() {
        System.out.println("Opening Browser...");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        System.out.println("User is on search page");
    }

    @When("I enter search term in box")
    public void i_enter_search_term_in_box() {
        System.out.println("Entering search terme!");
    }

    @When("I click on Search button")
    public void i_click_on_search_button() {
        System.out.println("clicking search button");
    }

    @Then("Show Results")
    public void show_results() {
        System.out.println("Showing results");
        driver.quit();
        System.out.println("Closed Browser");
    }


}
