package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ecomm {
    WebDriver driver;
    @BeforeMethod
    @Parameters("BROWSER")
    public void browserOpen(String browser)
    {
        switch (browser)
        {
            case "chrome":
                {
                System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                }
            case "firefox":
                {
                    System.setProperty("webdriver.gecko.driver", "./src/drivers/geckodriver.exe");
                     driver = new FirefoxDriver();

                }


        }
    }
    @AfterMethod()
    public void browserClose() {

        driver.quit();
    }
/*    WebDriver driver;
    @BeforeMethod(groups = {"int","uat"})
    public void browserOpen(){
        System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod(groups = {"int","uat"})
    public void browserClose(){

        driver.quit();
    }*/
    //@Test(groups = "int",dataProvider= "SearchProvider")
    @Test()
    @Parameters({"username","password"})
    public  void login(String uname, String pwd) throws InterruptedException {

        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(uname);
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(pwd);
        Thread.sleep(2000);
    }
  /*  @Test(groups = "int",dataProvider = "ecomurl")
    public void flipkart(String url)
    {

        driver.get(url);
        String title = driver.getTitle();
        System.out.print(title);
    }*/
    /*@Test(groups = "uat")
    public void amazon(){

        driver.get("https://www.amazon.com");
    }

    @Test
    public void snap(){
        driver.get("https://www.snapdeal.com");
    }*/
/*    @DataProvider(name="ecomurl")
    public Object[] getDataFromDataProvider(){
        return new  Object[]{

                           "https://www.ebay.com",
                            "https://www.walmart.com",
                            "https://www.shopclues.com",
                            "https://www.target.com"
        };

    }*/
/*    @DataProvider(name="SearchProvider")
    public Object[] getDataFromDataProvider(){
        return new  Object[][]{


                {"naveenredddyanuti@gmail.com","Naveen@4225"},
                {"naveenredddyanuti@gmail.com","Naveen@4226"},
                {"naveenredddyanuti@gmail.com","Naveen@4227"},

        };

    }*/
}