package SEL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseMovementConcept {
    public static void main(String[] args)  throws InterruptedException{
        System.setProperty("webdriver.gecko.driver","\"C:\\Users\\dell\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
        WebDriver driver =new ChromeDriver(); //launch chrome

       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();

        driver.get("http://spicejet.com");

        Actions action = new Actions(driver);//hover
        //Thread.sleep(5000);


        action.moveToElement(driver.findElement(By.xpath("//*[@class='css-1dbjc4n r-1rngwi6 r-o9xkwf']"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='css-76zvg2 r-homxoj r-ubezar']")).click();









    }
}
