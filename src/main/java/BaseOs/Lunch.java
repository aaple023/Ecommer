package BaseOs;

import org.testng.annotations.Test;
import pac.checkOut;

public class Lunch extends Bsae {
    @Test
    public void lunch() throws InterruptedException {
        SearchPage search=new SearchPage();
        search.add();
        checkOut check=new checkOut();
        check.CheckoutProduct();
    }
}
