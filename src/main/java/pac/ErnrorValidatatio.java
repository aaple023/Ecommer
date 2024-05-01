package pac;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ErnrorValidatatio extends Base {
    public ErnrorValidatatio(){

        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = "input[id='userEmail']")
    WebElement userNAme;
    @FindBy(css = "input[id='userPassword']")
    WebElement userPassword;
    @FindBy(css = "input[id='login']")
    WebElement submit;
    @FindBy(xpath = "(//div[@aria-label='Incorrect email or password.'])[1]")
    WebElement error;


    public void LogPage1(String user,String password){
        userNAme.sendKeys(user);
        userPassword.sendKeys(password);
        submit.click();
       String erreos= error.getText();
        System.out.println(erreos);
        Assert.assertTrue(error.getText().equals(erreos));
    }
    public Boolean productError(){
        String product="papaya";
        driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("nkk0112597@gmail.com");
        driver.findElement(By.cssSelector("input[id='userPassword']")).sendKeys("Mom@1234567890");
        driver.findElement(By.cssSelector("input[id='login']")).click();
        List<WebElement> productName= driver.findElements(By.xpath("//h5 "));
        Boolean match  = productName.stream().anyMatch(s->s.getText().equalsIgnoreCase(product));
        Assert.assertFalse(match,product);
        return match;
    }

}
