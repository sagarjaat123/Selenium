package SEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main{
public static void main(String[]args){

        //1 ff browser
        //geckodriver
        System.setProperty("webdriver.gecko.driver","\"C:\\Users\\dell\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
      WebDriver driver = new ChromeDriver();
      driver.get("http://www.cars24.com");
      String title=driver.getTitle();
    System.out.println(title);


   if(title.equals("Buy and Sell Used Cars Online | CARS24")){
       System.out.println("correct");
   }
   else{
       System.out.println("in-correct");


        }
    System.out.println(driver.getCurrentUrl());
   driver.quit();
}
}