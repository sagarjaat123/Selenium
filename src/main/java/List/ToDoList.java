package List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDoList {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://beta.to-do.microsoft.com/tasks/");
        driver.findElement(By.id("actionButton")).click();
        Thread.sleep(5000);

        //Login
        driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("user4@xtenantsharing.onmicrosoft.com");
        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("i0118")).sendKeys("XTenant!123");
        driver.findElement(By.id("idSIButton9")).click();
        driver.findElement(By.id("KmsiCheckboxField")).click();
        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(15000);

        // Create List
        driver.findElement(By.id("baseAddInput-addList")).sendKeys("MyMyList");
        Thread.sleep(2000);
        driver.findElement(By.id("baseAddInput-addList")).sendKeys(Keys.ENTER);
        Thread.sleep(7000);

        //Create Task
        driver.findElement(By.xpath("//input[@class='baseAdd-input taskCreation expanded']")).sendKeys("cricket");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='baseAdd-button taskcreation']")).click();
        System.out.println("task is created");

        // Complete Task
        driver.findElement(By.xpath("//*[@class='fluentIcon checkBox-hover ___12fm75w f1w7gpdv fez10in fg4l7m0']")).click();
        System.out.println("task is completed");
        Thread.sleep(3000);

        //Delete Task
        driver.findElement(By.xpath("//*[@class='openCloseArrow closed']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='taskFadeShrink-enter-done']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='detailFooter-trash']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='button red']")).click();
        System.out.println("task is deleted");

    }
}
