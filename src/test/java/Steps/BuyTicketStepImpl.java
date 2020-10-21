package Steps;

import Base.BaseMethods;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebElement;

import static Constants.BuyTicketConstant.*;


public class BuyTicketStepImpl extends BaseMethods {

    @Step("pop up ları kapat")
    public void closeThePopUpp() {
        waitUntilElementAppear(CLOSE_POP_UP);
        clickElement(CLOSE_POP_UP);
        WebElement hes = findElement(CLOSE_HES);
        if (hes.isDisplayed() == true) {
            waitUntilElementAppear(CLOSE_HES);
            clickElement(CLOSE_HES);

        } else {
            System.out.println("HES kodu pop-up'ı gelmedi...");
        }
    }

    @Step("ucuz ucuş ara butonuna tıklanır")
    public void ucuzBiletAl() {
        waitUntilElementAppear(UCUZ_BILET_AL);
        clickElement(UCUZ_BILET_AL);
    }

    @Step("nereden butonuna tıklanır ve <key> havalimanı aranır")
    public void neredenGideceksin(String key) {
        waitUntilElementAppear(NEREDEN);
        clickElement(NEREDEN);
        waitUntilElementAppear(NEREDEN_YAZ);
        sendKeys(NEREDEN_YAZ, key);
        waitUntilElementAppear(NEREDEN_TIKLA);
        clickElement(NEREDEN_TIKLA);
    }

    @Step("nereye butonuna tıklanır ve <key> havalimanı aranır")
    public void nereyeGideceksin(String key) {
        waitUntilElementAppear(NEREYE);
        sendKeys(NEREYE, key);
        waitUntilElementAppear(NEREYE_TIKLA);
        clickElement(NEREYE_TIKLA);
    }

    @Step("yön bilgisi seçilir")
    public void yonGir() {
        waitUntilElementAppear(YON);
        clickElement(YON);
    }

    @Step("tarih bilgisi seçilir")
    public void tarihSec() {
        waitUntilElementAppear(TARIH_BUTTON);
        clickElement(TARIH_BUTTON);
        waitUntilElementAppear(TARIH_SEC);
        clickElement(TARIH_SEC);
        waitUntilElementAppear(TARIH_OK);
        clickElement(TARIH_OK);

    }


    @Step("uçuş aranır")
    public void ucusAra() {
        waitUntilElementAppear(UCUS_ARA);
        clickElement(UCUS_ARA);
    }


    @Step("çarpı butonlarına tıklanır")
    public void carpiButton() {
        waitUntilElementAppear(CLOSE_PCR);
        clickElement(CLOSE_PCR);
        waitUntilElementAppear(CLOSE_POP);
        clickElement(CLOSE_POP);
    }

    @Step("en üstte gelen bilet seçilir")
    public void enUstBilet() {
        waitUntilElementAppear(EN_UST_BILET);
        clickElement(EN_UST_BILET);
    }


    @Step("bagaj ile alakalı pop up kapatılır")
    public void bagajPopUp() {
        waitUntilElementAppear(BAGAJ_POP_UP);
        clickElement(BAGAJ_POP_UP);
    }


    @Step("ekonomik paket seçilir ve devam butonuna tıklanır")
    public void ekoPaket() {
        waitUntilElementAppear(EKO_PAKET);
        clickElement(EKO_PAKET);
        waitUntilElementAppear(DEVAM_BUTTON);
        clickElement(DEVAM_BUTTON);

    }


    @Step("fırsat ekranı geçilir")
    public void devamFirsat() {
        waitUntilElementAppear(FIRSAT_DEVAM_BUTTON);
        clickElement(FIRSAT_DEVAM_BUTTON);
    }
}
