package by.trainingcenter.at2020.scool;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

public class Runner {
    public static void main(String[] args) {
        WebDriver driver = WebDriverSingleton.getDriver();
        ScoolPage scoolPage = new ScoolPage(driver);
        scoolPage.open();
//        System.out.println(scoolPage.getTitle()); //выдаёт маленькими буквами
//        ScoolSteps.printTitleCapital(scoolPage); //выдает лого большими буквами
//        System.out.println("-----------");
//        for (String s:scoolPage.getMenuItems()) {
//            System.out.println("MENU_ITEMS.add(\"" + s + "\");");
//        }
//        ScoolSteps.printMenuAlthabetical(scoolPage); //выдает окна в алфавитном порядке
//   -----------------------------------------------------------------
        scoolPage.clickAboutLink();
        AboutPage aboutPage = new AboutPage(driver);
        
        aboutPage.clickOnHomeButton();
        scoolPage.clickAboutLink();

        aboutPage.clickOnMainButton();
        scoolPage.clickAboutLink();

        aboutPage.clickOnMainPageButton();
        driver.close();
    }
}
