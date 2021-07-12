package rest.salesforce.com.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforce.utils.Setup;

import java.util.HashMap;
import java.util.Map;

public class Test1BaseTest {

    public WebDriverWait wait;
    public WebDriver driver;
    public Map<String, Object> vars;
    static JavascriptExecutor js;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();

        driver.get("https://freeorg2-dev-ed.my.salesforce.com/");
        driver.manage().window().setSize(new Dimension(1831, 993));
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys(Setup.USER.toName());
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(Setup.PASSWORD.toName());
        driver.findElement(By.id("Login")).click();
    }

    @AfterClass
    public void end() {
        //        delete();
        driver.findElement(By.cssSelector(".slds-icon_container > span:nth-child(1)")).click();
        time();
        driver.findElement(By.linkText("Delete")).click();
        driver.findElement(By.cssSelector(".uiButton--brand:nth-child(2) > .label")).click();
//        logout();
        {
            WebElement element = driver.findElement(By.cssSelector(".profileTrigger > .uiImage"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".profileTrigger")).click();
        time();
        driver.findElement(By.linkText("Log Out")).click();
        driver.quit();
    }

    public void time() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    @BeforeMethod(onlyForGroups = "createAccount")
//    public void createAccount() throws JsonProcessingException {
//
//    }
//
//    @AfterMethod(onlyForGroups = "deleteAccount")
//    public void deleteProject() {
//
//    }

}
