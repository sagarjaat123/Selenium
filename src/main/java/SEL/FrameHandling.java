package SEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","\"C:\\Users\\dell\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
        WebDriver driver =new ChromeDriver(); //launch chrome

       // driver.manage().window().maximize(); //maximize window
        driver.manage().deleteAllCookies(); //delete all the cookies

        //dynamic wait

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

     driver.get("https://ui.cogmento.com/");

     driver.findElement(By.name("email")).sendKeys("sagarjaat595@gmail.com");
     driver.findElement(By.name("password")).sendKeys("Sagarjaat@123");
     driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();

     //if there is multiple frames use
        //driver.switchTo().frame("frame name")

     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@href='/contacts']")).click();
    }
}
