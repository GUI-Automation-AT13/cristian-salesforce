package rest.salesforce.com.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test1 extends Test1BaseTest{

    @Test
    public void test1() {
//        goFeature();
        driver.get("https://freeorg2-dev-ed.lightning.force.com/lightning/o/Campaign/list?filterName=Recent");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        create();
        driver.findElement(By.cssSelector(".forceActionLink > div")).click();
        time();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("prueba");
        driver.findElement(By.cssSelector(".forceActionButton:nth-child(3) > .label")).click();
        time();
//        goFeature();
        driver.get("https://freeorg2-dev-ed.lightning.force.com/lightning/o/Campaign/list?filterName=Recent");
        {
            wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("prueba")));
        }

    }

    public void time() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

