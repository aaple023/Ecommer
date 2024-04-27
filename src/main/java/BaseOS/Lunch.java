package BaseOS;


import org.testng.annotations.Test;

public class Lunch extends  OsSetUp {

    @Test(priority = 2)

    public void lunch() throws InterruptedException {
        test= reports.createTest("Demo one");

        Sbmodule1 b = new Sbmodule1();
        b.login("nkk227421@gmail.com","Mom@1234567890");
        reports.flush();
    }
    @Test(priority = 1)
    public void  validatate() throws InterruptedException {
        test= reports.createTest("Demo second");
        Sbmodule1 b1 = new Sbmodule1();
        b1.invaildemailformatvalidatetaerrorMessage("nkk227421@gmail.","Mom@1234567890");
        reports.flush();

    }
    @Test(priority = 3)
    public void dataget() throws InterruptedException {
        test= reports.createTest("Demo third");
        Search search1=new Search();
        search1.search();
        reports.flush();
    }
    @Test(priority = 4)
    public void productListest(){
        test= reports.createTest("Demo four");
        Product pro=new Product();
        pro.productList();
        reports.flush();
    }

}
