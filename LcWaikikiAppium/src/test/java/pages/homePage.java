package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import javax.xml.bind.Element;
import java.util.List;
public class homePage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By checkHomePage= MobileBy.id("com.lcwaikiki.android:id/txtWelcomeHeader");
    By checkNavigationKatagori=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView");
    By checkNavigationFavori=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.TextView");
    By checkNavigationSepet=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.TextView");
    By checkNavigationProfil=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.view.ViewGroup/android.widget.TextView");
    By checkNavigationButtonAnasayfa=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView");
    By checkButton=MobileBy.id("com.lcwaikiki.android:id/tvNext");
    By checkenable=MobileBy.id("com.lcwaikiki.android:id/navigationBottom");
    By checkSelected=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]");
    public homePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkHomePage(){
        driver.findElement(checkButton).click();
        driver.findElement(checkHomePage);
    }
    public void checkNavigationButton(String str){

        boolean check=false;
        if(driver.findElement(checkNavigationButtonAnasayfa).getText().contains(str)){
            check=true;
        }
        else if(driver.findElement(checkNavigationFavori).getText().contains(str)){
            check=true;
        }
        else if(driver.findElement(checkNavigationProfil).getText().contains(str)){
            check=true;
        }
        else if(driver.findElement(checkNavigationKatagori).getText().contains(str)){
            check=true;
        }
        else if(driver.findElement(checkNavigationSepet).getText().contains(str)){
            check=true;
        }
        Assert.assertEquals(true,check);
    }
    public void checkSelectedNavigationButton(String str) {
        boolean find = false;
        WebElement anasayfa=driver.findElement(checkNavigationButtonAnasayfa);
        WebElement katagori=driver.findElement(checkNavigationKatagori);
        WebElement favori=driver.findElement(checkNavigationFavori);
        WebElement sepet=driver.findElement(checkNavigationSepet);
        WebElement profil=driver.findElement(checkNavigationProfil);

        if (anasayfa.isSelected()==true && anasayfa.getText().contains(str)) {
                find = true;
        }
        else if (favori.isSelected()==true && favori.getText().contains(str)) {
            find = true;
        }
        else if (sepet.isSelected()==true && sepet.getText().contains(str)) {
            find = true;
        }
        else if (profil.isSelected()==true && profil.getText().contains(str)) {
            find = true;
        }
        else if (katagori.isSelected()==true && katagori.getText().contains(str)) {
            find = true;
        }
        Assert.assertEquals(true, find);

    }

}
