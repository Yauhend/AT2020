package by.trainingcenter.at2020.gkb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class NonMainPage extends Page{

    @FindBy(xpath = "//*[@id=\"tm-fullscreen-h\"]/section/div/div[2]/p/a")
    WebElement returnBtn;


    public NonMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickReturnBtn(){
        returnBtn.click();
    }

}
