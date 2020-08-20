package by.trainingcenter.at2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    private WebDriver driver = by.trainingcenter.at2020.WebDriverSingleton.getDriver();

    @FindBy (xpath = "//*[@id=\"j-header-react-line-two\"]/div/div[2]/div/button/span")
    private WebElement Accaunt;

    @FindBy (xpath = "<span id=\"selen-7anxb49cjn\">Войти</span>")
    private WebElement Bxod;

    @FindBy (xpath = "//*[@id=\"react-popup\"]/div/div[2]/div[2]/div[2]/input")
    private WebElement emailImput;

    @FindBy (xpath = "//*[@id=\"react-popup\"]/div/div[2]/div[3]/div[2]/input")
    private WebElement passwordImput;

    @FindBy (xpath = "<div class=\"selen-pokdbn5820x\" style=\"display: inline-block; color: rgb(255, 255, 255); background: rgb(0, 119, 204); padding: 14px 24px; text-align: center; font-weight: 700; font-family: Arial, sans-serif; font-size: 14px; line-height: 20px; border-radius: 4px; margin-top: 32px; cursor: pointer; box-sizing: border-box; user-select: none; height: 48px; min-width: 120px;\">Войти</div>")
    private WebElement voiti;

    public LogInPage(){
        PageFactory.initElements(driver,this);
    }
    
    public LogInPage typeName(String name){
        emailImput.sendKeys(name);
        return this;
    }

    public LogInPage typePassword(String password){
        passwordImput.sendKeys(password);
        return this;
    }

    public void clickSubmit(){ clickSubmit();
    }

    public void printMessage(){
        System.out.println(printMessage().'getText'();
    }

}

