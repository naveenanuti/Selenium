package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Media {
    WebDriver driver;
    @BeforeMethod(groups = {"int","uat"})
    public void browserOpen(){
        System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod(groups = {"int","uat"})
    public void browserClose(){

        driver.quit();
    }
    @Test(groups = "int")
    public void facebook(){

        driver.get("https://www.facebook.com");
    }
    @Test(groups = "uat")
    public void twitter(){

        driver.get("https://www.twitter.com");
    }

    @Test
    public void instagram(){
        driver.get("https://www.instagram.com");
    }
}
