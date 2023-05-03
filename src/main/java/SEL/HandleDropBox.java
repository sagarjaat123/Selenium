package SEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","\"C:\\Users\\dell\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
        WebDriver driver =new ChromeDriver();
       driver.get("https://www.royalenfield.com/in/en/financepage-india/?utm_source=google&utm_medium=cpc&utm_campaign=ao_in_mc_brand&utm_content=exact&utm_term=royal%20enfield&gclid=Cj0KCQjw3a2iBhCFARIsAD4jQB39ja36abU1JM5cp98fn84hJlDwqw8dBgv3TgczoefUSFw2Nlnd6NgaAgy5EALw_wcB");

       driver.findElement(By.id("fullname")).sendKeys("sagarjaat");
       driver.findElement(By.name("email")).sendKeys("sdghksk344@gmail.com");

        //handle drop box
        Select select=new Select(driver.findElement(By.linkText("Select Motorcycle")));
        select.selectByVisibleText("Bullet");





    }
}
