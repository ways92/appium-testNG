package tests;

import base.BaseClass;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Subtraction extends BaseClass {

    MobileElement btnSubtraction, fieldTotal;
    String actualResult;


    @When("I click button subtraction")
    public void iSelectIconSubtraction() {
        btnSubtraction = driver.findElement(By.id("com.google.android.calculator:id/op_sub"));
        btnSubtraction.click();

    }


    @Then("see the subtraction result and validate")
    public void iSeeTheMultiplyResultAndValidate() {
        fieldTotal = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        actualResult = fieldTotal.getText();
        System.out.println("The result is : "+actualResult);

        Assert.assertEquals(actualResult,"2");
        teardown();

    }
}
