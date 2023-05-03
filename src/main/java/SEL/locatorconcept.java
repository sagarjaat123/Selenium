package SEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorconcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","\"C:\\Users\\dell\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D58355126069%26ext_vrnc%3Dhi%26hvadid%3D610644601173%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9300793%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D2775905295463237102%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26ref%3Dpd_sl_7hz2t19t5c_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

    //1. XPATH  ----2 PRIORITY
        // DO NOT USE ABSOLUTE XPATH
        //ONLY USE RELATIVE XPATH
    //    driver.findElement(By.xpath("//input[@id=\"ap_customer_name\"]")).sendKeys("sagar");
      //  driver.findElement(By.xpath("//input[@id=\"ap_phone_number\"]")).sendKeys("95675856858");


    //2. Id  => FIRST PRIORTIY IF GIVEN  - 1
          //  driver.findElement(By.id("ap_customer_name")).sendKeys("sagar");
            //driver.findElement(By.id("ap_phone_number")).sendKeys("977984794");
            //driver.findElement(By.id("ap_email")).sendKeys("ssgser34@gmail.com");

    //3. Name  --- 3 PRIORITY
     //   driver.findElement(By.name("customerName")).sendKeys("sagar jaat");
       // driver.findElement(By.name("email")).sendKeys("sgaiuyts823@gmail.com");

    //4. linktext ----IF LINKS ARE GIVEN ,GIVE IT 1 PRIORITY

      //  driver.findElement(By.linkText("Sign in")).click();

     //5.CSS selector----2

    // driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("sagar jaat");

    //6. ClassName =>  not useful---4
    // 7  . Partiallinktext => not useful


    }
}
