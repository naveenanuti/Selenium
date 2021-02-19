package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class OperaTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.opera.driver","./src/drivers/operadriver.exe");
        WebDriver driver = new OperaDriver();
         driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
         driver.findElement(By.id("email")).sendKeys("9701954225");
        driver.findElement(By.id("email")).clear();

        driver.findElement(By.id("pass")).sendKeys("naveeen@4225");
        Thread.sleep(2000);
        /*driver.findElement(By.name("login")).click();*/

        driver.findElement(By.partialLinkText("Create a Pag")).click();
        //driver.findElement(By.linkText("Sign Up")).click();

        driver.findElement(By.cssSelector(".\\_yla")).click();
        WebElement day = driver.findElement(By.id("day"));
         Select s = new Select(day);
         ArrayList<WebElement> day1;
        day1 = (ArrayList<WebElement>) s.getOptions();
        for (WebElement e1:day1)
        {
            System.out.println(e1.getText());
        }
       boolean b = s.isMultiple();
        System.out.println(b);
         s.selectByIndex(20);
        Thread.sleep(4000);

       WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
        Select s1 = new Select(month);
        ArrayList<WebElement> all = (ArrayList<WebElement>) s1.getOptions();
        for (WebElement e :all)
             {
           // System.out.println(e);
            System.out.println(e.getText());
        }
        s1.selectByValue("6");
        /*Thread.sleep(4000);

        WebElement year = driver.findElement(By.id("year"));
        Select s2 = new Select(year);
        s2.selectByVisibleText("1992");
        Thread.sleep(4000);

        boolean button = driver.findElement(By.name("sex")).isEnabled();
        System.out.println(button);
        Thread.sleep(6000);

*/
        driver.quit();
    }
}
