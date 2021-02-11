# Java Cucumber Project

A BDD project that uses Cucumber with Java and Selenium

- [Cucumber API Docs](https://cucumber.io/docs/cucumber/api/)
- [report usage](https://www.toolsqa.com/selenium-cucumber-framework/cucumber-reports/)

## Tasks

- [x] Setup maven project
- [x] add cucumber dependencies to pom file
- [x] add selenium dependencies to pom file 
- [x] create feature file under src/test/resources package
- [x] create step definitions file under src/test/java/StepDefinitions
- [x] create runner class under src/test/java/StepDefinitions
- [x] ability to handle parameters
- [x] Pom/[page factory]((https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/PageFactory.html))  
- [x] using [tags]((https://cucumber.io/docs/cucumber/api/#tags))
    - running mvn test using tags from command line: ```mvn test -Dcucumber.filter.tags="@stability or  @regression"```
- [x] using [hooks](https://cucumber.io/docs/cucumber/api/#hooks)
    - for setup and teardown
    - examples: @After, @Before
    - control flow using order: ```@Before(order=1)```
    - conditional hooks to run things tagged with smoke: ```@Before("@smoke")```
- [x] using Background
    - step or a group of steps that are commond to all the scenarios in a feature
    - avoids repetition; visible to readers
- [ ] command line usage
- [x] use Dockerfile
    - to create image: ``` docker build -t javacucumber .```
- [ ] docker-compose
- [ ] run via Jenkins pipeline

## Shortcuts
- format code
    - Ecllipse: ```ctrl + a and Ctril + i```
    - IntelliJ: ```Ctrl + Alt + L```

## Resources
- [Tutorial Source](https://www.youtube.com/watch?v=tJdnLwGBFoI&list=PLhW3qG5bs-L_mFHirOLEYJ7X2rIXu8SR2)
- [Cucumber Java Maven testng](https://medium.com/agile-vision/cucumber-bdd-part-2-creating-a-sample-java-project-with-cucumber-testng-and-maven-127a1053c180)
- [docker container spring boot application with maven and docker compose ](https://medium.com/swlh/spring-boot-with-maven-in-docker-application-with-docker-compose-6db30b80d9e1)