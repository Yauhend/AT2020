package by.trainingcenter.at2020.gkb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends NonMainPage {

    private String pageUrl = "http://6gkb.by/kontakty";

    public ContactsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    String getUrl() {
        return pageUrl;
    }
}
