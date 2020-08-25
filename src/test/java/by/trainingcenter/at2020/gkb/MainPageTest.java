package by.trainingcenter.at2020.gkb;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest {
    WebDriver driver;
    ScoolPage mainPage;

    @BeforeEach
    void setUp() {
        this.driver = WebDriverSingleton.getDriver();
        mainPage = new MainPage(driver);
        mainPage.openPage();
    }

    @Test
    void checkTitle() {
        String title = driver.getTitle();
        assertEquals("«Средняя школа №73 города Минска»", title);
    }

    @Test
    void checkTitle() {
        String title = driver.getTitle();
        assertEquals("«Средняя школа №73 города Минска»", TITLE);
    }
    @Test
    void instagramLinkIsDisplayed() {
        WebElement kdlInstagram = mainPage.getKdlInstagram();
        assertTrue(kdlInstagram.isDisplayed());
    }

    @Test
    void menuItemsQuantity() {
        assertEquals(8, MainPageSteps.countMainMenuItems(mainPage));
    }

    @AfterEach
    void tearDown() {
        driver.close();
        WebDriverSingleton.killDriver();
    }
}
