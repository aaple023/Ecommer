import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class DemoTestP {
    public  static WebDriver driver;


    @BeforeClass
    public static void setUp(){
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/s?k=coffee&crid=2NGAT1K89S325&sprefix=coffee%2Caps%2C237&ref=nb_sb_noss_1");
    }
    @Test(groups = "num")
    public void lunch() throws InterruptedException {
     List<WebElement>   productName=driver.findElements(By.cssSelector(".a-size-base-plus.a-color-base.a-text-normal"));
     int k=0;
     for (int i=0;i<productName.size();i++) {
String pro=productName.get(i).getText();

 WebElement productNamed = productName.stream().filter(s -> s.getText().equals("Nescafé Classic Pouch, 500g")).findFirst().orElse(null);
k++;
Thread.sleep(3000);
     productNamed.findElement(By.xpath("(//button[@id='a-autoid-15-announce'])[1]")).click();

if (k==productName.size()){
    break;
}
     }
    }
}
