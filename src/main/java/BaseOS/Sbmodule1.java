package BaseOS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static BaseOS.OsSetUp.driver;


public class Sbmodule1 {
    public void login( String email, String password) throws InterruptedException {
      //a   ++driver.findElement(By.cssSelector(".caret")).click();
        Thread.sleep(2000);
      driver.findElement(By.xpath("//a[text()='Login']")).click();
      driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
      driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
      driver.findElement(By.xpath("//input[@value='Login']")).click();

        }


    public void invaildemailformatvalidatetaerrorMessage( String email, String password) throws InterruptedException {
        driver.findElement(By.cssSelector(".caret")).click();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.findElement(By.cssSelector(".caret")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();



    }
}

