package SEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","\"C:\\Users\\dell\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.get("http://html.com/input-type-file/");

        driver.findElement(By.xpath("/input[@id=fileupload]")).sendKeys("\"D:\\practice\\practical.html\"");
    }
}
