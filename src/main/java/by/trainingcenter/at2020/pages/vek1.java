package by.trainingcenter.at2020.pages;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

public class vek1 {

    private static String pageUrl;

    public static void main(String[] args) {
        WebDriver driver = WebDriverSingleton.getDriver();

        driver.get(vek1.pageUrl);

        vek1 vek1 = vek1;
                .printElements()
                .clickOnvek1();
        vek1.typeName("name")
                .typePassword("pass")
                .clickSubmit();
        vek1.printMessage();
        driver.close();
    }

    private void printMessage() {
    }

    private by.trainingcenter.at2020.pages.MailPage typeName(String name) {
        return null;
    }

    private void clickOnvek1() {
    }

    private static by.trainingcenter.at2020.pages.vek1 printElements() {
    }
}

