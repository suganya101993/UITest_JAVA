# QA Automated test using Java with Cucumber and Selenium WebDriver #

This project have QA assessment test. Done the set up for the automated test using java language with Selenium and Cucumber.

It contains UI automated for Podium webpage  

Test scenarios are described in the feature files located here ./src/test/resources/com/QA/sample.



## Installation ##

You need to have [Java 8 JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) installed along with [maven](https://maven.apache.org/download.cgi).

To run the tests locally with Chrome, install ChromeDriver from [here](http://chromedriver.chromium.org), add its location to your system PATH and add webdriver.chrome.driver=path/to/the/driver to your local variables.

To run the tests locally with Firefox, install GeckoDriver from [here](https://github.com/mozilla/geckodriver/releases) and add its location to your system PATH.

To install all dependencies, run 

```console
$ mvn clean install
```

## Running tests ##

```console
$ mvn test
```

By default, tests will run on Chrome. To change that, specify `-Dbrowser={browser}` where `{browser}` is either `chrome` or `firefox`. If you haven't added the chrome driver path to your local variables, you can add it directly in the run command with the option `-Dwebdriver.chrome.driver=path/to/the/driver`.

You can also select specific scenarios to execute using `-Dcucumber.options="--tags @your_tag"`. More info about tags and how to combine them [here](https://github.com/cucumber/cucumber/tree/master/tag-expressions).

## Cucumber Studio (Hiptest) ##

Feature files can be handled with Cucumber Studio (previously called Hiptest), a test management platform. To get started with Cucumber Studio, 
go [here](https://cucumber.io/tools/cucumberstudio/getting-started-with-behavior-driven-development/). Features files in 
this project were exported directly from an [Hiptest project](https://studio.cucumber.io/projects/102008) using 
[Hiptest publisher](https://github.com/hiptest/hiptest-publisher).

