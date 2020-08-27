package by.trainingcenter.at2020.scool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AboutPage {


    protected WebDriver driver;

     @FindBy (xpath = "//*[@id=\"h_menu\"]/span/a")
     protected WebElement mainPage;

     @FindBy (xpath = "//*[@id=\"REGION_1_DEFAULT\"]/div/div/div/a")
     protected WebElement mainTwoPage;

     @FindBy (xpath = "//*[@id=\"breadcrumbs\"]/a[1]")
     protected WebElement mainThreePage;

    public AboutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ScoolPage clickMainPage() {
        mainPage.click();
        return new ScoolPage(driver);
    }
    public ScoolPage clickMainTwoPage() {
        mainTwoPage.click();
        return new ScoolPage(driver);
    }
    public ScoolPage clickMainThreePage() {
        mainThreePage.click();
        return new ScoolPage(driver);
    }


    }


