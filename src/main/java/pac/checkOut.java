package pac;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOut extends Base {
    public checkOut(){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//button[normalize-space()='Checkout']")
    WebElement clickUp;
    @FindBy(xpath = "//input[@placeholder='Select Country']")
    WebElement selects;
    public void CheckoutProduct(){
        clickUp.click();
        selects.sendKeys("india");
        Actions a=new Actions(driver);
        a.sendKeys(selects,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).doubleClick().build().perform();


    }

}
