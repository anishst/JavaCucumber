# Java Cucumber Project

A BDD project that uses Cucumber with Java and Selenium

- [Cucumber API Docs:](https://cucumber.io/docs/cucumber/api/)
- [report usage](https://www.toolsqa.com/selenium-cucumber-framework/cucumber-reports/)

## Tasks

- [x] Setup maven project
- [x] add cucumber dependencies to pom file
- [x] add selenium dependencies to pom file 
- [x] create feature file under src/test/resources package
- [x] create step definitions file under src/test/java/StepDefinitions
- [x] create runner class under src/test/java/StepDefinitions
- [x] ability to handle parameters
- [x] Pom/page factory  
- [x] using tags
    - running mvn test using tags from command line: ```mvn test -Dcucumber.filter.tags="@stability or  @regression"```
- [ ] use Dockerfile
- [ ] docker-compose
- [ ] run via Jenkins pipeline

## Eclipse shortcuts
- format code: ctrl + a and Ctril + i

## Resources
- [Tutorial Source](https://www.youtube.com/watch?v=tJdnLwGBFoI&list=PLhW3qG5bs-L_mFHirOLEYJ7X2rIXu8SR2)
- [Page Factory](https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/PageFactory.html)
- [Tags in Cucumber](https://cucumber.io/docs/cucumber/api/#tags)