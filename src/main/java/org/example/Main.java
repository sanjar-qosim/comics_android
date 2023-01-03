package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static AppiumDriver<MobileElement> driver;
    public static void main(String[] args) {
        appium1();
    }


    public static void appium1(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
//        caps.setCapability("platformVersion", "13");
//        caps.setCapability("udid", "7f39d8a8");
//        caps.setCapability("automationName", "uiAutomator2");
        caps.setCapability("appPackage", "uz.ssd.comics.dev");
        caps.setCapability("appActivity", "uz.ssd.comics.activities.MainActivity");
//        Для очистки кэша
//        caps.setCapability("noReset", "true");
//        caps.setCapability("fullReset", "false");
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub/");
            driver = new AppiumDriver<MobileElement>(url,caps);

//            First step
//            MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.n0/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[10]/android.widget.Button");
//            el2.click();

            MobileElement profileBtn = (MobileElement) driver.findElementByAccessibilityId("Профиль");
            profileBtn.click();
            MobileElement login = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.n0/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[2]");
            login.click();
            MobileElement auth = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]");
            auth.click();
            MobileElement mail = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
            mail.sendKeys("ssdmobiledevacc@gmail.com");
            MobileElement password = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
            password.sendKeys("12312312");
            MobileElement authBtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.Button");
            authBtn.click();
            MobileElement comPage = (MobileElement) driver.findElementByAccessibilityId("Комиксы");
            comPage.click();
            MobileElement download = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.n0/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[10]/android.view.View");
            download.click();
            download.click();



        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}

