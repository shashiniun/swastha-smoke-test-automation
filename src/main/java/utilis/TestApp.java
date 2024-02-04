package utilis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestApp {

    private WebDriver driver;
    private static TestApp myObt;
    PropertyFileReader prop=new PropertyFileReader();
    public static TestApp getInstance(){
        if(myObt==null){
            myObt=new TestApp();
            return myObt;
        }
        else {
            return myObt;
        }
    }
    public WebDriver getDriver(){
        return driver;
    }
    private void setDriver(WebDriver driver){
        this.driver=driver;
    }
    public static void setMyObt(TestApp myObt){
        TestApp.myObt=myObt;
    }
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
    }
    public void navigateToUrl(){
        String url=prop.getProperty("config","url");
        driver.get(url);
    }
    public void closeBrowser(){
        driver.quit();
    }
    public WebElement waitUntilNextElementAppears(By locator, int timeOut){
        WebElement element=new WebDriverWait(TestApp.getInstance().getDriver(), Duration.ofSeconds(timeOut)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }
    public void setText(By locator,String text){

        driver.findElement(locator).sendKeys(text);
    }
    public void clickSign(By locator){
        driver.findElement(locator).click();
    }

}
