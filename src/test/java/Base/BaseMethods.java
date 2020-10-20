package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BaseMethods extends BaseSetup {



    public void waitUntilElementAppear(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public WebElement findElement(By by){
        waitUntilElementAppear(by);
        return driver.findElement(by);
    }
    public void clickElement(By by){
        waitUntilElementAppear(by);
        findElement(by).click();
    }
    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }




//    public void closeThePopUp() {
//        untilElementAppear(CLOSE_POP_UP);
//        clickElement(CLOSE_POP_UP);
//        untilElementAppear(CLOSE_HES);
//        clickElement(CLOSE_POP_UP);
//    }

//    public void biletAl() {
//        WebElement ucuzBiletAl = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.pozitron.pegasus:id/activity_home_button_search_flight")));
//        ucuzBiletAl.click();
//    }

//    public void yonSec() {
//        WebElement yonSec = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.pozitron.pegasus:id/right")));
//        yonSec.click();
//    }

//    public void tarihGir() {
//        WebElement tarihButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.pozitron.pegasus:id/fragment_search_flight_layout_departure_date")));
//        tarihButton.click();
//        WebElement tarihSec = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout[6]/android.widget.FrameLayout/android.widget.LinearLayout\n")));
//        tarihSec.click();
//        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.pozitron.pegasus:id/fragment_date_selection_button_approve")));
//        okButton.click();
//    }

//    public void ucusArama() {
//        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.pozitron.pegasus:id/fragment_search_flight_button_search")));
//        okButton.click();
//    }

}
