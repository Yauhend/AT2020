package by.trainingcenter.at2020.pages;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

public class PageRunner {

    public static void main(String[] args) {
        WebDriver driver = WebDriverSingleton.getDriver();

        driver.get(MainPage.pageUrl);
        MainPage mainPage = new MainPage();

        MailPage mailPage = mainPage
                .printElements()
                .clickOnMail();
        mailPage.typeName("name")
                .typePassword("pass")
                .clickSubmit();
        mailPage.printMessage();
        driver.close();
    }
}
