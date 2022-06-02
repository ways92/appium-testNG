package tests;

import base.BaseClass;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Multiply extends BaseClass {

    MobileElement btnMultiply, fieldTotal;
    String actualResult;


    @When("I click button multiply")
    public void iSelectIconMultiply() {
        btnMultiply = driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
        btnMultiply.click();

    }


    @Then("see the multiply result and validate")
    public void iSeeTheMultiplyResultAndValidate() {
        fieldTotal = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        actualResult = fieldTotal.getText();
        System.out.println("The result is : "+actualResult);

        Assert.assertEquals(actualResult,"8");
        teardown();

    }
}
