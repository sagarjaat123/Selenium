package SEL;
//import java.lang.Thread;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","\"C:\\Users\\dell\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.name("proceed")).click();
        Thread.sleep(2000);


        Alert alert =driver.switchTo().alert();

        String text = alert.getText();

        if(text.equals("Please enter a valid user name")){
            System.out.println("correct alert");
        }
        else{
            System.out.println("incorrect alert");
        }
        System.out.println(alert.getText());

        alert.accept();
      //  alert.dismiss();
    }
}
