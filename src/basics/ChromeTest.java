package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChromeTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.facebook.com");

        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        // to know howmay frames are there in the page
        List<WebElement>  str = driver.findElements(By.tagName("frame"));
        System.out.println(str.size());

        driver.manage().window().maximize();
        Thread.sleep(3000);
    /*    WebElement loginframe = driver.findElement(By.xpath("//frame[@name='login_page']"));
        driver.switchTo().frame(loginframe );*/
        //driver.switchTo().frame(0);
        driver.switchTo().frame("login_page");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("65200335");
         String str1=driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).getAttribute("maxlength");
         System.out.println(str1);
        String title = driver.getTitle();
        System.out.println(title);
        //driver.switchTo().parentFrame();

        //driver.switchTo().frame(0);
        Thread.sleep(2000);
  /*      driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[3]/table/tbody/tr[1]/td/table[3]/tbody/tr/td/a")).click();
        System.out.println(driver.getTitle());*/
        driver.switchTo().defaultContent();
        driver.switchTo().frame("footer");
        String getprivacy= driver.findElement(By.xpath("/html/body/form/p/a[2]")).getText();
        System.out.println( getprivacy);

        Thread.sleep(3000);
        driver.quit();



        /*driver.manage().window().maximize();
        Thread.sleep(2000);
        Dimension d = new Dimension(800,600);
        driver.manage().window().setSize(d);

        driver.navigate().to("https://www.twitter.com");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        String url =  driver.getCurrentUrl();
        System.out.println(url);
        String  title = driver.getTitle();
        System.out.println(title);


        driver.quit();*/

    }
}
