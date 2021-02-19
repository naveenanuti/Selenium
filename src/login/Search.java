package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search {
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
    public void google(){

        driver.get("https://www.google.com");
    }
    @Test(groups = "uat")
    public void tumblr(){

        driver.get("https://www.tumblr.com");
    }

    @Test
    public void opera(){
        driver.get("https://www.opera.com");
    }
}
