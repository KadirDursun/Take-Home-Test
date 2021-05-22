package com.demo_project.pages;

import com.demo_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoPage {
    public DemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Actions builder = new Actions(Driver.getDriver());

    public void clickSearchbutton(String text) {
        btnSearchToggle.click();
        searchText.sendKeys(text);
        searchText.submit();
    }


    public void clickSingIn() {
        btnSignIn.click();
    }

    public void clickSingUp() {
        btnSignUp.click();
    }

    public void enterSignUpCredentials(String id, String email, String password) {
        username.sendKeys(id);
        emailId.sendKeys(email);
        passwordId.sendKeys(password);
        btnSubmit.click();
    }

    public String getPageTitle() {
        return txtSearchTitle.getText();
    }

    public void enterLoginCredentials(String username, String passwordId) {
        userId.sendKeys(username);
        userPassword.sendKeys(passwordId);
        btnlogin.click();
    }

    public String getWelcomeMessage() {
        return txtWelcomeMessage.getText();
    }

    public void selectMenu() {
        builder.moveToElement(companyDdList).build().perform();
        contactUs.click();
    }

    public void selectSubject(String subject) {
        Select objSel = new Select(dropdownSubject);
        objSel.selectByVisibleText(subject);
    }

    public void enterFirstName(String firstName) {
        txtFirstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        txtLastName.sendKeys(lastName);
    }

    public void selectJobFunction(String function) {
        Select objSel2 = new Select(dropdownJobFunction);
        objSel2.selectByVisibleText(function);
    }

    public void enterCompanyName(String companyName) {
        txtCompany.sendKeys(companyName);
    }

    public void enterPhoneNumber(String phoneNumber) {
        txtPhone.sendKeys(phoneNumber);
    }

    public void enterEmailAddress(String emailAddress) {
        txtEmail.sendKeys(emailAddress);
    }

    public void selectCountry(String country) {
        Select objSel3 = new Select(txtCountry);
        objSel3.selectByVisibleText(country);
    }

    public void enterMessage(String message) {
        txtMessageBox.sendKeys(message);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText().trim();
    }

    public void clickGetStarted() {
        getStartedButton.click();
    }

    public boolean laptopIsDisplayed() {
        return laptopImage.isDisplayed();
    }

    @FindBy(xpath = "//h1[@class='text-center title']")
    public WebElement txtSearchTitle;

    @FindBy(id = "searchText")
    public WebElement searchText;

    @FindBy(id = "searchToggle")
    public WebElement btnSearchToggle;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    public WebElement btnSignIn;

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    public WebElement btnSignUp;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "email")
    public WebElement emailId;

    @FindBy(id = "password")
    public WebElement passwordId;

    @FindBy(id = "submit")
    public WebElement btnSubmit;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userId;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement userPassword;

    @FindBy(id = "nw_submit")
    public WebElement btnlogin;

    @FindBy(xpath = " //div[@class='styles__headline___3KoOn']")
    public WebElement txtWelcomeMessage;

    @FindBy(xpath = "//li[@class='company nav-item dropdown-wrap']")
    public WebElement companyDdList;

    @FindBy(xpath = "//ul[@class='submenu']//a[contains(text(),'Contact us')]")
    public WebElement contactUs;

    @FindBy(id = "ContactUsSubject")
    public WebElement dropdownSubject;

    @FindBy(id = "FirstName")
    public WebElement txtFirstName;

    @FindBy(id = "LastName")
    public WebElement txtLastName;

    @FindBy(id = "Job_Function__c")
    public WebElement dropdownJobFunction;

    @FindBy(id = "Company")
    public WebElement txtCompany;

    @FindBy(id = "Email")
    public WebElement txtEmail;

    @FindBy(id = "Phone")
    public WebElement txtPhone;

    @FindBy(id = "Country")
    public WebElement txtCountry;

    @FindBy(id = "commentsAppending")
    public WebElement txtMessageBox;

    @FindBy(xpath = "//button[@class='mktoButton']")
    public WebElement submitButton;


    @FindBy(xpath = "//span[@data-testid='usernameError']")
    public WebElement errorMessage;

    @FindBy(xpath = "(//img[@class='image'])[1]")
    public WebElement laptopImage;

    @FindBy(xpath = " //a[contains(text(),'Get Started')]")
    public WebElement getStartedButton;


}
