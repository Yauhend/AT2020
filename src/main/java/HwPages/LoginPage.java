package HwPages;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import javax.xml.xpath.XPath;

public class LoginPage {

    private WebDriver driver = WebDriverSingleton.getDriver();

    @FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/input")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button")
    private WebElement enterbutton;

    @FindBy (xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/div")
    private WebElement message;

    public LoginPage () {
        PageFactory.initElements(driver, this);
    }

    public LoginPage typeEmail (String email) {
        emailInput.sendKeys(email);
        return this;
    }
    public LoginPage typePassword (String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public void clickEnterButton() {enterbutton.click();}

    public void printMessage() {System.out.println(message.getText());}
}
