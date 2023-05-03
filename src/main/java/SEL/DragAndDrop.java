package SEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","\"C:\\Users\\dell\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
        WebDriver driver =new ChromeDriver(); //launch chrome

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        Actions action = new Actions(driver);

        action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
                .release()
                .build()
                .perform();
    }
}
