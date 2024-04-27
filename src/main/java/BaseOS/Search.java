package BaseOS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static BaseOS.OsSetUp.driver;

public class Search {
    public void search() throws InterruptedException {
       WebElement iteam  = driver.findElement(By.xpath("//input[@name='search']"));
       iteam.sendKeys("macs");
      Thread.sleep(3000);
      iteam.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
      String d=driver.findElement(By.xpath("//h2")).getText();
        System.out.println(d);
        Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(),d);


    }
}
