package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name = 'cusid']")).sendKeys("1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name = 'submit']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
       // alert.accept();
        String message = alert.getText();
        System.out.println(message);
        alert.dismiss();



        driver.quit();
    }


}
