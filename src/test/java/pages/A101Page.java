package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101Page {

    public A101Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
                     //button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']
    public WebElement cookie;

    @FindBy(xpath = "//div[@class='closePopupPersona']")
    public WebElement cookie2;

    @FindBy(xpath = "//span[text()='Giriş Yap']")
    public WebElement girisYap1;

    @FindBy(xpath = "//a[@href='https://www.a101.com.tr/login/?next=/']")
    public WebElement girisYap2;

    @FindBy(xpath = "//input[@class='js-login-input js-login-phone-number-mask js-form-input']")
    public WebElement cepTel;

    @FindBy(xpath = "//BUTTON[@class='button block green mt-1 js-login-btn']")
    public WebElement GIRISYAP;

    @FindBy(xpath = "//button[@class='js-send-verification button green']")
    public WebElement dogrulaButonu;

    @FindBy(xpath = "//input[@class='js-search-input js-search-autocomplete personaclick-instant-search ui-autocomplete-input personaclick-instant-search-rendered']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement arabutonu;

    @FindBy(xpath = "//label[@for='attributes_integration_colourSİYAH']")
    public WebElement siyahRenk;

    @FindBy(xpath = "(//img[@class=' ls-is-cached lazyloaded'])[1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "(//a[@class='variant-colors__item js-variant js-variant-size  '])[3]")
    public WebElement bedenM;


    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkleButonu;

    @FindBy(xpath = "//a[@class='go-to-shop']")
    public WebElement sepetiGoruntuleButonu;

    @FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnaylaButonu;

    @FindBy(xpath = "(//a[@title='Calvin Klein CJ9T1329-BLK Kadın Body Siyah'])[3]")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "")
    public WebElement aaa;

    @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    public WebElement kaydetVeDevamEt;

    @FindBy(xpath = "(//label[@class='js-checkout-cargo-item'])[2]")
    public WebElement kargoSec;

    @FindBy(xpath = "")
    public WebElement aada;


//button[@class='button block green js-proceed-button']

  //  @FindBy(xpath = "//*[text()='Hesabım']")
 //   public WebElement HesabimButonu;





}
