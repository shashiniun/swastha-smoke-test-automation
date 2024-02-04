package lk.gov.health.swastha;

import org.bouncycastle.util.test.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilis.PropertyFileReader;
import utilis.TestApp;

public class Dashboard {
    PropertyFileReader propertyFileReader = new PropertyFileReader();

    String okElement = propertyFileReader.getProperty("Dashboard", "ok.element");
    String orderElement = propertyFileReader.getProperty("Dashboard","order.element");

    WebDriver driver = TestApp.getInstance().getDriver();

    public Dashboard clickOk() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(okElement), 10);
        driver.findElement(By.xpath(okElement)).click();
        return this;
    }
    public Orders clickOrdersInNavigationBar(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(orderElement),10);
        driver.findElement(By.xpath(orderElement)).click();
        return new Orders();
    }

}
