package by.trainingcenter.at2020.pages;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {

    private WebDriver driver = WebDriverSingleton.getDriver();


    @FindBy(xpath = "//*[@id=\"Username\"]")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"form\"]/fieldset/div[3]/input")
    private WebElement submitBtn;

    @FindBy(xpath = "//*[@id=\"form\"]/fieldset/strong")
    private WebElement message;

    public MailPage() {
        PageFactory.initElements(driver, this);
    }

    public MailPage typeName(String name) {
        nameInput.sendKeys(name);
        return this;
    }

    public MailPage typePassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public void clickSubmit() {
        submitBtn.click();
    }

    public void printMessage() {
        System.out.println(message.getText());
    }

}
