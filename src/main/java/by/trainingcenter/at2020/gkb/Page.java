package by.trainingcenter.at2020.gkb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class Page {

    protected WebDriver driver;

    @FindBy(xpath = "//a[text()='Контакты']")
    protected WebElement contactsLink;

    @FindBy(xpath = "/html/body/header/div[2]/div/div/div/div/nav/ul/li[2]/a")
    protected WebElement oBolnitse;

    @FindBy(xpath = "/html/body/header/div[2]/div/div/div/div/nav/ul/li/a")
    List<WebElement> mainMenuItems;

    //  и так далее все элементы, общие для всех страниц

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    abstract String getUrl();

    public void openPage() {
        driver.get(getUrl());
    }

    public void clickContactsLink() {
        contactsLink.click();
    }

    public void hoverOBoltnitse() {
        Actions actions = new Actions(driver);
        actions.moveToElement(oBolnitse).build().perform();
    }

    public List<WebElement> getMainMenuItems() {
        return mainMenuItems;
    }
    // и так далее для каждого элемента
}
