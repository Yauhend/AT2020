package by.trainingcenter.at2020.gkb;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

public class GkbRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverSingleton.getDriver();

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickContactsLink();
        ContactsPage contactsPage = new ContactsPage(driver);
        contactsPage.hoverOBoltnitse();
        Thread.sleep(1000);
        contactsPage.clickReturnBtn();

    }
}
