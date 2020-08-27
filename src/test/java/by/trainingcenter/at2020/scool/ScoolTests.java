package by.trainingcenter.at2020.scool;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class ScoolTests {

    private static final String PAGE_TITLE = "Комитет по образованию Мингорисполкома\n" +
            "Управление по образованию администрации Первомайского района г. Минска\n" +
            "Государственное учреждение образования\n" +
            "«Средняя школа №73 города Минска»";


    private static final List<String> MENU_ITEMS = new ArrayList<>();

    private static final String EXPECTED_URL = "http://sch73.minsk.edu.by/ru/main.aspx";
    private static final String EXPECTED_TITLE = "Средняя школа №73 г. Минска";

    private void setList() {
        MENU_ITEMS.add("Одно окно");
        MENU_ITEMS.add("Об учреждении");
        MENU_ITEMS.add("Учительская");
        MENU_ITEMS.add("Обучающимся");
        MENU_ITEMS.add("Законным представителям");
        MENU_ITEMS.add("Родительский университет");
        MENU_ITEMS.add("Выпускнику - 2020");
        MENU_ITEMS.add("Приём в 1 класс");
        MENU_ITEMS.add("Музей имени М.Ф. Шмырёва");
        MENU_ITEMS.add("Профильное обучение");
        MENU_ITEMS.add("Дополнительные образовательные услуги");
        MENU_ITEMS.add("Летние каникулы");
        MENU_ITEMS.add("Безопасное лето");
        MENU_ITEMS.add("СППС");
        MENU_ITEMS.add("6-ой школьный день");
        MENU_ITEMS.add("Воспитательная работа");
        MENU_ITEMS.add("ШАГ");
        MENU_ITEMS.add("Онлайн-конкурс #беларусьпомнит73");
        MENU_ITEMS.add("ФОТОГАЛЕРИЯ");
        MENU_ITEMS.add("Сервисы");
    }



    private WebDriver driver;
    private ScoolPage page;

    @BeforeEach
    void setUp() {
        driver = WebDriverSingleton.getDriver();
    }

    @Test
    void checkTitle() {
        createOpenPageSchoolPage();
        String realTitle = page.getTitle();
        Assertions.assertEquals(PAGE_TITLE, realTitle);
    }

    @Test
    void checkMenuItems() {
        createOpenPageSchoolPage();
        setList();
        List<String> realMenuItems = page.getMenuItems();
        Assertions.assertEquals(MENU_ITEMS, realMenuItems);
    }

    @Test
    void checkNavigation1() {
        createOpenPageSchoolPage();
        AboutPage aboutPage = page.clickAboutLink();
        aboutPage.clickOnMainPageButton();
        Assertions.assertEquals(EXPECTED_URL, driver.getCurrentUrl());
    }

    @Test
    void checkNavigation2() {
        createOpenPageSchoolPage();
        AboutPage aboutPage = page.clickAboutLink();
        aboutPage.clickOnMainButton();
        Assertions.assertEquals(EXPECTED_URL, driver.getCurrentUrl());
    }

    @Test
    void checkNavigation3() {
        createOpenPageSchoolPage();
        AboutPage aboutPage = page.clickAboutLink();
        aboutPage.clickOnHomeButton();
        Assertions.assertEquals(EXPECTED_TITLE, driver.getTitle());
    }

    @AfterEach
    void coolDown() {
        driver.close();
        WebDriverSingleton.killDriver();
    }

    private void createOpenPageSchoolPage() {
        page = new ScoolPage(driver);
        page.open();
    }
}
