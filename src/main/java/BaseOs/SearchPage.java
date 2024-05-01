package BaseOs;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class SearchPage extends Bsae {

    public SearchPage() {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement item;
    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    List<WebElement> productName;
    @FindBy(name = "quantity")
    WebElement quantity1;
    @FindBy(id = "add-to-cart-button")
    WebElement addToCard;
    @FindBy(id = "a-autoid-8-announce")
    WebElement clickI;


    public void add() throws InterruptedException {
        String[] productList = {"coffee","book","watch" };
        for (String produ:productList) {
            if (produ.equalsIgnoreCase("coffee")){
                item.sendKeys(produ);
                item.submit();
for (int i=0;i<productName.size();i++){

  String name=  productName.get(i).getText();
  if(name.equalsIgnoreCase("Nescafé Classic Pouch, 500g")){
      productName.get(i).click();
      Set<String> window= driver.getWindowHandles();
      Thread.sleep(5000);
      Iterator<String> it =  window.iterator();
      String prarent=it.next();
      String child=it.next();

     driver.switchTo().window(child);
     addToCard.submit();




  }

}
            }

        }
    }
}


