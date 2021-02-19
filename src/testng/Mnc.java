package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mnc {
    WebDriver driver;
    @BeforeMethod
    public void browserOpen(){
        System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod()
    public void browserClose(){

        driver.quit();
    }
    @Test
    public void microsoft(){

        driver.get("https://www.microsoft.com");
    }
    @Test
    public void ibm(){

        driver.get("https://www.ibm.com");
    }

    @Test
    public void oracle(){
        driver.get("https://www.oracle.com");
    }
}
