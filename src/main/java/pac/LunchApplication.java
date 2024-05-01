package pac;

import org.testng.annotations.Test;

public class LunchApplication extends Base {


    @Test(priority = 1)
    public void lunchApplication() throws InterruptedException {
        log lo=new log();
        lo.LogPage("nkk0112597@gmail.com","Mom@1234567890");
        productPage probm=new productPage();
        probm.productList();

    }
    @Test(priority = 2)
    public void Errorvalidata(){
        ErnrorValidatatio error=new ErnrorValidatatio();
        error.LogPage1("nkkk@234567","Mom@1234567890");
    }
    @Test(priority = 3)
    public void productCatlogerror(){
        ErnrorValidatatio error=new ErnrorValidatatio();
        error.productError();

    }
}
////div[@class='top-tab']