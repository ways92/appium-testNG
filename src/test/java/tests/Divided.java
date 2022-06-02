package tests;

import base.BaseClass;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Divided extends BaseClass {

    MobileElement btnDivided, btnEqual, fieldTotal;
    String actualResult;


    @When("I click divided")
    public void iSelectButtonDivide() {
        btnDivided = driver.findElement(By.id("com.google.android.calculator:id/op_div"));
        btnDivided.click();

    }

    @When("I click equal")
    public void iClickEqual() {
        btnEqual = driver.findElement(By.id("com.google.android.calculator:id/eq"));
        btnEqual.click();
    }


    @Then("see the divided result and validate")
    public void iSeeTheDividedResultAndValidate() {
        fieldTotal = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        actualResult = fieldTotal.getText();
        System.out.println("The result is : "+actualResult);

        Assert.assertEquals(actualResult,"2");
        teardown();

    }
}
