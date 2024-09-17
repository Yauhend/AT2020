package by.trainingcenter.at2020.scool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OpenPage {
    private String pageUrl = "http://sch73.minsk.edu.by/";

    public OpenPage(WebDriver driver) {
       PageFactory.initElements (driver, this);
    }

}
