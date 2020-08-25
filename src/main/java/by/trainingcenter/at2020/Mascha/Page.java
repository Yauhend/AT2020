import java.util.Collection;
import java.util.List;

public abstract class Page {

    @FaindBy (xpath = "//a[text () = 'Отделения и службы']")
    protected WebElement otdeleniyaisluzhbyLink;

    protected WebDriver driver;

    @FindBy (xpath = "/html/body/div[5]/div/div/div/main/article/div/div/div/div/div/p/a")
    List<WebElement> otdeleniyaisluzhbyItems;

    @FindBy (xpath = "/html/body/div[5]/div/div/div/main/article/div/div/div[1]/div/div")
    List<WebElement> ukpanelItems;

    public Page (WebDriver) {
        this.driver = driver;
        PageFactory.initElements (driver,this);

    }
    abstract String getUrl ();

    public void openPage (){
    driver.get(getUrl());
    }

    public void clickotdeleniyaisluzhbyLink() {
        otdeleniyaisluzhbyLink.clic();
            }

    public List<WebElement> getOtdeleniyaisluzhbyItems() {
        return otdeleniyaisluzhbyItems;
    }

    public List<WebElement> getUkpanelItems() {
        return ukpanelItems;
    }

}