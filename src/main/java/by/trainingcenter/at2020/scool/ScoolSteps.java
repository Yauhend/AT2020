package by.trainingcenter.at2020.scool;

import by.trainingcenter.at2020.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoolSteps {
    public static void printTitleCapital(ScoolPage scoolPage){
        System.out.println(scoolPage.getTitle().toUpperCase()); //toUpperCase - метод,который выводит все большими буквами
    }
    public static void printMenuAlthabetical(ScoolPage scoolPage){
        List<String> result = new ArrayList<>(scoolPage.getMenuItems());   //скопировали со страницы скулпэдж,объявили новое имя
        Collections.sort(result);   //возвращаем result
        System.out.println(result);
    }
}
