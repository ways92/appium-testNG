package tests;

import base.BaseClass;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseClass {


    @Test
    public void testModel() {
        System.out.println("test started.....");

        MobileElement btn2 , btn4, btnMultiply, fieldTotal;

        btn2 = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        btn2.click();

        btnMultiply = driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
        btnMultiply.click();

        btn4 = driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
        btn4.click();

        fieldTotal = driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
        String actualResult = fieldTotal.getText();

        Assert.assertEquals(actualResult,"8");
        System.out.println("The result is : "+actualResult);


        System.out.println("test completed.....");
    }
}
