package basics;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class EdgeTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.edge.driver","./src/drivers/msedgedriver1.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Wait wait1 = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class);

         WebElement email = driver.findElement(By.id("email"));
         wait1.until(ExpectedConditions.elementToBeClickable(email));



        WebElement password = driver.findElement(By.id("pass"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(password));

        driver.findElement(By.id("pass")).sendKeys("naveeen@4225");

        WebElement createpage = driver.findElement(By.partialLinkText("Create a Pag"));
        wait.until(ExpectedConditions.elementToBeClickable( createpage));

        File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileHandler.copy(screen, new File("./src/screenshot/fbc.png"));






        driver.quit();


    }
}
