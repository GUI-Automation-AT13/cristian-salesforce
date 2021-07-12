package rest.salesforce.com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test2  extends Test1BaseTest{

    @Test
    public void test1() {
//        goFeature();
        driver.get("https://freeorg2-dev-ed.lightning.force.com/lightning/o/Campaign/list?filterName=Recent");
        time();
//        create();
        driver.findElement(By.cssSelector(".forceActionLink > div")).click();
        time();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("prueba");
        driver.findElement(By.xpath("//a[contains(text(),\'Conference\')]")).click();
        time();
        driver.findElement(By.linkText("Webinar")).click();
        driver.findElement(By.xpath("//a[contains(text(),\'Planned\')]")).click();
        time();
        driver.findElement(By.linkText("In Progress")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("8/7/2021");
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10/7/2021");
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("150");
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("200");
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("180");
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("100,0");
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("20");
        time();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/textarea[1]")).sendKeys("prueba descrption");
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
