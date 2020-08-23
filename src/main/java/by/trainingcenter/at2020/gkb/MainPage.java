package by.trainingcenter.at2020.gkb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page {

    private String pageUrl = "http://6gkb.by/";

    public WebElement getKdlInstagram() {
        return kdlInstagram;
    }

    @FindBy(xpath = "//*[@id=\"tm-top-a\"]/div/section/div/div[2]/div/div[1]/div[1]/p/a/img")
    private WebElement kdlInstagram;


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    String getUrl() {
        return pageUrl;
    }

    public void clickKDLInstagram() {
        kdlInstagram.click();
    }

}
