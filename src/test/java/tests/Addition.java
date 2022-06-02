package tests;

import base.BaseClass;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Addition extends BaseClass {

    MobileElement btn2 , btn4, btnAdd, fieldTotal;
    String actualResult;


    @Given("On calculator app")
    public void OnCalculatorApp() {
        setup();
        System.out.println("I on calculator app");
    }

    @When("I select first number")
    public void iSelectFirstNumber() {
        btn2 = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        btn2.click();

    }

    @When("I click button add")
    public void iSelectIconAdd() {
        btnAdd = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        btnAdd.click();

    }

    @When("I select second number")
    public void iSelectSecondNumber() {
        btn4 = driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
        btn4.click();
    }

    @Then("I see the addition result and validate")
    public void iSeeTheResultAndValidate() {
        fieldTotal = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        actualResult = fieldTotal.getText();

        Assert.assertEquals(actualResult,"6");
        System.out.println("The result is : "+actualResult);
        teardown();

    }
}
