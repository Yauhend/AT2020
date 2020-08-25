public class otdeleniyaisluzhbyPage extends NonMainPage {

    private String pageUrl = "http://6gkb.by/otdeleniya-i-sluzhby";

    public otdeleniyaisluzhbyPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements (driver, this);
    }

    @Override
    String getUrl() {
        return pageUrl;
    }
}
