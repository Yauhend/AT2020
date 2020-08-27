package by.trainingcenter.at2020.scool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {

    private WebDriver driver;


    public AboutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"breadcrumbs\"]/a[1]")
    WebElement mainPage;

    @FindBy(xpath = "//*[@id=\"REGION_1_DEFAULT\"]/div/div/div/a")
    WebElement main;

    @FindBy(xpath = "//*[@id=\"h_menu\"]/span/a")
    WebElement homeButton;

    public void clickOnMainPageButton() {
        mainPage.click();
    }

    public void clickOnMainButton() {
        main.click();
    }

    public void clickOnHomeButton() {
        homeButton.click();
    }

}
// driver.getcururl...
//.get title