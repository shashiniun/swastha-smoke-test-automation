package lk.gov.health.swastha;

import org.bouncycastle.util.test.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilis.PropertyFileReader;
import utilis.TestApp;

public class Orders {
    PropertyFileReader propertyFileReader = new PropertyFileReader();

    String itemWiseElement = propertyFileReader.getProperty("Orders", "create.item.wise.element");
    String selectWareHouseElement = propertyFileReader.getProperty("Orders", "dropdown.warehouse.element");
    String wareHouseElement = propertyFileReader.getProperty("Orders", "selected.warehouse.element");
    String selectDateElement=propertyFileReader.getProperty("Orders","select.date.element");
    String selectedDateElement=propertyFileReader.getProperty("Orders","selected.date.element");
    String daysMonthDropdownElement=propertyFileReader.getProperty("Orders","days.month.dropdown.element");
    String selectedDateMonthElement=propertyFileReader.getProperty("Orders","selected.date.month.element");
    String generateElement=propertyFileReader.getProperty("Orders","generate.element");
    String orderQuantityElement=propertyFileReader.getProperty("Orders","order.quantity.element");
    String cartElement=propertyFileReader.getProperty("Orders","cart.element");
    String orderListElement=propertyFileReader.getProperty("Orders","order.list.element");

    WebDriver driver = TestApp.getInstance().getDriver();

    public Orders clickItemWiseOrders() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(itemWiseElement), 10);
        driver.findElement(By.xpath(itemWiseElement)).click();
        return this;
    }

    public Orders selectWareHouse() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(selectWareHouseElement), 10);
        driver.findElement(By.xpath(selectWareHouseElement)).click();
        return this;
    }

    public Orders wareHouse() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(wareHouseElement), 10);
        driver.findElement(By.xpath(wareHouseElement)).click();
        return this;
    }
    public  Orders selectDateDropdown() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(selectDateElement),10);
        driver.findElement(By.xpath(selectDateElement)).click();
        return this;
    }
    public  Orders selectedDate() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(selectedDateElement),10);
        driver.findElement(By.xpath(selectedDateElement)).click();
        return this;
    }

    public Orders daysMonthDropdown() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(daysMonthDropdownElement),10);
        driver.findElement(By.xpath(daysMonthDropdownElement)).click();
        return this;
    }
    public  Orders selectedDateMonth() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(selectedDateMonthElement),10);
        driver.findElement(By.xpath(selectedDateMonthElement)).click();
        return this;
    }
    public  Orders clickGenerate() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(generateElement),10);
        driver.findElement(By.xpath(generateElement)).click();
        return this;
    }

    public Orders orderQuantity(String enterQuantity) {
        TestApp.getInstance().waitUntilNextElementAppears(By.id(orderQuantityElement), 10);
        WebElement toClear=driver.findElement(By.id(orderQuantityElement));
        toClear.sendKeys(Keys.CONTROL + "a");
        toClear.sendKeys(Keys.DELETE);
        TestApp.getInstance().setText(By.id(orderQuantityElement),enterQuantity);
        return  this;
    }

    public Orders clickCart() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(cartElement),10);
        driver.findElement(By.xpath(cartElement)).click();
        return this;
    }

    public OrderList clickOrderList() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(orderListElement),10);
        driver.findElement(By.xpath(orderListElement)).click();
        return new OrderList();
    }

}
