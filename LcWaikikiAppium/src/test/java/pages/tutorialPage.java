package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;


public class tutorialPage {

    By checkHomePage= MobileBy.id("com.lcwaikiki.android:id/txtWelcomeHeader");
    By checkOppenApp=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[1]/android.widget.ImageView\n");
    By checkText=MobileBy.id("com.lcwaikiki.android:id/textView");
    By checkTitle=MobileBy.id("com.lcwaikiki.android:id/tvTitle");
    By checktitleDesc=MobileBy.id("com.lcwaikiki.android:id/tvContent");
    By checkButton=MobileBy.id("com.lcwaikiki.android:id/tvNext");
    By destinationdrop=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[2]/android.widget.ImageView");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;


    public tutorialPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkOpenedApp(){
        driver.findElement(checkOppenApp);

    }
    public void checkTvTutorial(){
        driver.findElement(checkOppenApp);

    }
    public void checkText(String str){
        String text=driver.findElement(checkText).getText();
        Assert.assertEquals(str,text);
    }
    public void checkTitle(String str){
        String text=driver.findElement(checkTitle).getText();
        Assert.assertEquals(str,text);
    }
    public void ceheckTitleDesc(String str){
        String text=driver.findElement(checktitleDesc).getText();
        boolean check=false;
        if(text.contains(str)){
            check=true;
        }
        Assert.assertEquals(true,check);

    }
    public void checkButton(String str){
        String text=driver.findElement(checkButton).getText();
        Assert.assertEquals(text,str);

    } public void dragAndDropTvTutoial(){

        TouchAction action = new TouchAction(driver);
        WebElement first= driver.findElement(checkOppenApp);
        WebElement last=driver.findElement(destinationdrop);
        action.longPress(new LongPressOptions().withElement(new
                ElementOption().withElement(first))).perform();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        action.moveTo(new ElementOption().withElement(last)).perform();

    }
    public void clickSkipButton(){
        driver.findElement(checkButton).click();

    }
    public void checkkHomePage(){
        driver.findElement(checkHomePage);
    }
}
