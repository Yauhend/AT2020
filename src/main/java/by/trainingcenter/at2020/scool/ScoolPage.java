package by.trainingcenter.at2020.scool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ScoolPage {

    private WebDriver driver;

    private String pageurl = "http://sch73.minsk.edu.by/";

    @FindBy(xpath = "//*[@id=\"logo_block_content\"]")
    protected WebElement logoScool;

    @FindBy(xpath = "//*[@id=\"h_menu\"]/ul/li/a")
    List<WebElement> menuItems;

    public ScoolPage(WebDriver d) {
        this.driver = d;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(pageurl);
    }

    public List<String> getMenuItems() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < menuItems.size(); i++) {
            result.add(menuItems.get(i).getText());

        }
        return result;
    }

    public String getTitle(){
        return logoScool.getText();
    }

}
