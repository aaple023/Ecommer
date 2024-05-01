import org.bouncycastle.util.Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class Stanlon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("nkk0112597@gmail.com");
        driver.findElement(By.cssSelector("input[id='userPassword']")).sendKeys("Mom@1234567890");
        driver.findElement(By.cssSelector("input[id='login']")).click();
      List<WebElement> productName= driver.findElements(By.xpath("//h5 "));
      for (WebElement prob:productName){
          System.out.println(prob.getText());
      }
        WebElement oneProduct = productName.stream().filter(s -> s.getText().equals("ZARA COAT 3")).sorted().findFirst().orElse(null);
        oneProduct.findElement(By.xpath("//button[text()=' Add To Cart']")).click();
        WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(9));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@routerlink='/dashboard/cart']")));
Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();
    WebElement selects=driver.findElement(By.xpath("//input[@placeholder='Select Country']"));
    selects.sendKeys("india");
        Actions a=new Actions(driver);
        a.sendKeys(selects,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).doubleClick().build().perform();



    }
}
