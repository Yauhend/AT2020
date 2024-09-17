package by.trainingcenter.at2020.Mascha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OtdeleniyaisluzhbyPage extends Page {

    private String pageUrl = "http://6gkb.by/otdeleniya-i-sluzhby";

    public OtdeleniyaisluzhbyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements (driver, this);
    }

    @Override
    String getUrl() {
        return pageUrl;
    }
}
