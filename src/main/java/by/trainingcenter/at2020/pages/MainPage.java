package by.trainingcenter.at2020.pages;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    public static String pageUrl = "https://www.tut.by/";


    private WebDriver driver = WebDriverSingleton.getDriver();

    @FindBy(xpath = "/html/body/div[3]/div[1]/div[1]/div[2]/div[1]/div/h1/a")
    private WebElement headerLogo;

    @FindBy(xpath = "//*[@id=\"mainmenu\"]/ul/li[3]/a")
    private WebElement mail;

    @FindBy(xpath = "//*[@id=\"mainmenu\"]/ul/li/a")
    private List<WebElement> webElements;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnLogo() {
        headerLogo.click();
    }

    public MailPage clickOnMail() {
        mail.click();
        return new MailPage();
    }

    public MainPage printElements() {
        for (WebElement e : webElements) {
            String title = e.getAttribute("title");
            System.out.println(title);
        }
        return this;
    }
}
