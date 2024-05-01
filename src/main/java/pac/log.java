package pac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class log extends Base {
    public log(){

        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = "input[id='userEmail']")
    WebElement userNAme;
    @FindBy(css = "input[id='userPassword']")
    WebElement userPassword;
    @FindBy(css = "input[id='login']")
    WebElement submit;


    public void LogPage(String user,String password){
        userNAme.sendKeys(user);
        userPassword.sendKeys(password);
        submit.click();
    }


}
