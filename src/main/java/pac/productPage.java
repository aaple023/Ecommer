package pac;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class productPage extends Base {

   public productPage(){

       this.driver=driver;
       PageFactory.initElements(driver,this);

   }
    @FindBy(xpath = "//h5 ")
    List<WebElement> productName;
   @FindBy(xpath = "//button[@routerlink='/dashboard/cart']")
   WebElement card;
  By pru= By.xpath("//button[text()=' Add To Cart']");
By path=  By.xpath("//button[@routerlink='/dashboard/cart']");


   public void productList() throws InterruptedException {
       WebElement oneProduct = productName.stream().filter(s -> s.getText().equals("ZARA COAT 3")).sorted().findFirst().orElse(null);
       oneProduct.findElement(pru).click();
       WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(9));
       wait.until(ExpectedConditions.visibilityOfElementLocated(path));
       Thread.sleep(5000);
       card.click();


   }
}
