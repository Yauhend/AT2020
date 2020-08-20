package HwPages;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

public class PageRunner {
    public static void main(String[] args) {
        WebDriver driver = WebDriverSingleton.getDriver();
        driver.get(Main_Page.pageUrl);

        Main_Page mainPage =new Main_Page();
        mainPage.clickOnLogButton();
    LoginPage loginPage= new LoginPage();
        loginPage.typeEmail("email")
                 .typePassword("password")
                 .clickEnterButton();
        loginPage.printMessage();
         driver.close();
    }
    //Написать кратко
    //1. Открыть страницу------
    //2.FindBy кнопку "вход"-
    //3. Ввести логин,пороль,нажать на кнопку вход
    //-------------------------------------------------------
    // Дополнительно к Main_Page
    //С помощью FindBy xPAth к примеру найти что то и вывести в консоле
}
