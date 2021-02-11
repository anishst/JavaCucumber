package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pagefactory.GoogleSearchPage_PF;


import java.util.concurrent.TimeUnit;

// page factory way
public class GoogleSearchSteps_PF {


    WebDriver driver = null;

//     hook to run this before every scenario
    @Before
    public void browserSetup() {
        //driver setup
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options); // assumes chrome driver is setup and is in Path var
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

//   hook to run this after every scenario
    @After
    public  void tearDown(){
        driver.close();
        driver.quit();
        System.out.println("Closed Browser");
    }

    //   hook to run this before every step
    @BeforeStep
    public static void beforeSteps() {
        System.out.println("I am inside before steps");
    }

    //   hook to run this after every step
    @AfterStep
    public static void afterSteps() {
        System.out.println("I am inside after steps");
    }

    @Given("User is on Google Search Page")
    public void user_is_on_google_search_page() {
        System.out.println("Opening Browser...");
        System.out.println("Project Path: " + System.getProperty("user.dir"));
        driver.get("http://www.google.com");
        System.out.println("User is on search page");
    }

    //    example of passing search term using parameter with regex
    @When("^I enter (.*) in box$")
    public void i_enter_search_term_in_box(String searchterm) {

//        new page object
        GoogleSearchPage_PF search = new GoogleSearchPage_PF(driver);
//        use pom method
        search.enter_search_term(searchterm);

    }

    @When("I click on Search button")
    public void i_click_on_search_button() {

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }

    @Then("Show Results")
    public void show_results() throws InterruptedException {
        System.out.println("Showing results");
        Thread.sleep(2);

    }


}

