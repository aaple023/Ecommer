package BaseOS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static BaseOS.OsSetUp.driver;

public class Product {
    public void  productList(){
        driver.findElement(By.xpath("(//a[text()='Cameras'])[1]")).click();
        JavascriptExecutor jc=((JavascriptExecutor)driver);
        jc.executeScript("window.scrollBy(0,300)");
        WebElement camera =driver.findElement(By.xpath("//a[text()='Canon EOS 5D']"));
        camera.findElement(By.xpath("//span[text()='Add to Cart']")).click();
        WebElement don=driver.findElement(By.id("input-option226"));
        Select sc=new Select(don);
        sc.selectByIndex(0);
        driver.findElement(By.xpath("//button[@id='button-cart']")).click();


    }
}
