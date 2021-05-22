package com.demo_project.tests;

import com.demo_project.pages.DemoPage;
import com.demo_project.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Scanner;

public class DemoTest {

    DemoPage demoPage = new DemoPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3);

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("http://docker.com/");
    }

    // Verify the sign up page in http://docker.com/ website
    @Test
    public void testSignUp() {
        demoPage.clickSingIn();
        demoPage.clickSingUp();
        demoPage.enterSignUpCredentials("kd", "asd@yahoo.com", "123456789");
        Assert.assertEquals(demoPage.getErrorMessage(), "Use 4 to 30 letters & digits only.");
    }

    // Verify the search module in http://docker.com/ website
    @Test
    public void testSearch() {
        demoPage.clickSearchbutton("java");
        Assert.assertEquals(demoPage.getPageTitle(), "Search for java");

    }

    // Verify the log in module in http://docker.com/ website
    @Test
    public void testSignIn() {
        demoPage.clickSingIn();
        demoPage.enterLoginCredentials("sdet12345", "123456789");
        Assert.assertEquals(demoPage.getWelcomeMessage(), "Welcome to Docker Hub");
    }

    // Verify the Contact us form in http://docker.com/ website
    @Test
    public void testContactUsForm() {
        demoPage.selectMenu();
        demoPage.selectSubject("Marketing");
        demoPage.enterFirstName("XYZ");
        demoPage.enterLastName("ABC");
        demoPage.selectJobFunction("Developer");
        demoPage.enterCompanyName("ABC");
        demoPage.enterEmailAddress("asdfg@asd.com");
        demoPage.enterPhoneNumber("3458894498");
        demoPage.selectCountry("Argentina");
        demoPage.enterMessage("Hello World");
        demoPage.clickSubmitButton();
        wait.until(ExpectedConditions.urlContains("thank-you"));
        String expectedURL = "https://www.docker.com/company/contact-thank-you";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedURL);
    }

    // Verify the laptop image is displayed or not in http://docker.com/ website
    @Test
    public void testLaptopImage() {
        demoPage.clickGetStarted();
        Assert.assertTrue(demoPage.laptopIsDisplayed());
    }

    @Test
    public void testInputFromConsoleToContinue_XX1(){
        System.out.println("Click any key and 'enter' key in Console to continue the tests..");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        System.out.println("continue the tests " + line);
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
