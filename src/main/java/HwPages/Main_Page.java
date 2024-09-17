package HwPages;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Main_Page {
    public static String pageUrl = "https://catalog.onliner.by/";

    private WebDriver driver = WebDriverSingleton.getDriver();

    @FindBy(xpath = "//*[@id=\"userbar\"]/div[2]/div/div/div[1]")
    private WebElement loginbutton;



    public Main_Page (){ PageFactory.initElements(driver, this); }

    public void clickOnLogButton() {loginbutton.click();}

}
