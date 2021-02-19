package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class FirefoxTest {
    public static void main(String[] args) throws InterruptedException {
        //in this program i have used chrome driver instead of firefox driver because it opened in incongnitoo
        System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    /*    System.setProperty("webdriver.gecko.driver","./src/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();*/
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        String parent= driver.getWindowHandle();
        Set<String> all= driver.getWindowHandles();

        for (String cw:all) {

            if (!parent.equals(cw)) {


                driver.switchTo().window(cw);
                Thread.sleep(2000);
                System.out.println(driver.getTitle());
                driver.close();


            }
        }
        driver.quit();

        /*Iterator<String> i= all.iterator();
        while (i.hasNext()){

            String cw= i.next();
            if (!parent.equals(cw)){


                driver.switchTo().window(cw);
                Thread.sleep(2000);
                System.out.println(driver.getTitle());
                driver.close();

            }
        }

        driver.quit();*/

    }
}
