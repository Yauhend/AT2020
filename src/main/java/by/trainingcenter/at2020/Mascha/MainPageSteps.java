package by.trainingcenter.at2020.Mascha;


public class MainPageSteps {
    public static int countOtdeleniyaisluzhbyItems(Page page) {
        return page.getOtdeleniyaisluzhbyItems().size();
    }
    public static int countukpanelItems(Page page) {
        return page.getUkpanelItems().size();
    }
}

