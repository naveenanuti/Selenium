package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mail {
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
    public void gmail(){
        driver.get("https://www.gmail.com");
    }
    @Test
    public void yahoo(){

        driver.get("http://www.yahoo.in");
    }

    @Test
    public void outlook(){

        driver.get("http://www.outlook.com");
    }
}
