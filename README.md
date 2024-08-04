## Assignment Overview

This repository contains the automation scripts for testing the following pages of the application:
- Login Page
- Home Page

### App URL
[https://sakshingp.github.io/assignment/login.html](https://sakshingp.github.io/assignment/login.html)

### Testing Frameworks used
- Selenium WebDriver

### Programming Languages
- Java

## Tests

### Login Page
Cover all possible functional testing scenarios. Note that any value of username/password is valid to log in to the application.

### Home Page
After successfully logging into the application, click the AMOUNT header in the transaction table and verify that the values are sorted.

## Key 
- Use of framework or OOP concepts.
- Use of assertions.
- Good coverage of test cases.
- HTML reporting (good to have).

## Setup Instructions

1. Clone the repository:
    ```bash
    git clone <repository-url>
    ```
2. Navigate to the project directory:
    ```bash
    cd <repository-directory>
    ```
3. Install the necessary dependencies.

### For Java:
   - Ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed.
   - Install [Maven](https://maven.apache.org/install.html).

4. Configure the project:
    - Set up the required dependencies in your `pom.xml` for Selenium WebDriver, TestNG, and Cucumber.
    - Example `pom.xml` snippet:
        ```xml
        <dependencies>
            <dependency>
                <groupId>org.seleniumhq.selenium</groupId>
                <artifactId>selenium-java</artifactId>
                <version>4.x.x</version>
            </dependency>
            <dependency>
                <groupId>org.testng</groupId>
                <artifactId>testng</artifactId>
                <version>7.x.x</version>
                <scope>test</scope>
            </dependency>
            <dependency>
                <groupId>io.cucumber</groupId>
                <artifactId>cucumber-java</artifactId>
                <version>6.x.x</version>
            </dependency>
            <dependency>
                <groupId>io.cucumber</groupId>
                <artifactId>cucumber-testng</artifactId>
                <version>6.x.x</version>
            </dependency>
        </dependencies>
        ```

5. Run the tests:
    ```bash
    mvn test
    ```

THANK YOU! HAPPY TESTING!
