package BaseOS;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

import static BaseOS.OsSetUp.driver;


public class Listner implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("In Listner class =Test started successfully");
    }



    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("In Listner class =Test Pass successfully");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File path=new File("/home/amit/IdeaProjects/demo0/untitled0986/src/test/java/Ecommer/src/main/java/BaseOS/screen.png");
        System.out.println("fail test case");

        try {
            FileUtils.copyFile(file,path);
        } catch (Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("In Listner class =Test finished successfully");

    }


}
