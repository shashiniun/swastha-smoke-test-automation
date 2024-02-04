package lk.gov.health.swastha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilis.PropertyFileReader;
import utilis.TestApp;

import java.sql.Driver;

public class DrugStoreKeeperLoginPage {

PropertyFileReader propertyFileReader= new PropertyFileReader();
String usernameElement= propertyFileReader.getProperty("DrugStoreKeeperLoginPage","user.name.element");
String passwordElement=propertyFileReader.getProperty("DrugStoreKeeperLoginPage", "password.element");
String signInElement=propertyFileReader.getProperty("DrugStoreKeeperLoginPage", "sign.in.element");
String dropDownUserRole=propertyFileReader.getProperty("DrugStoreKeeperLoginPage", "drop.down.user.roles");
String userRolesElement=propertyFileReader.getProperty("DrugStoreKeeperLoginPage","user.roles.element");
String saveElement=propertyFileReader.getProperty("DrugStoreKeeperLoginPage","save.element");


WebDriver driver = TestApp.getInstance().getDriver();

public DrugStoreKeeperLoginPage enterUserName(String userName){
    TestApp.getInstance().waitUntilNextElementAppears(By.name(usernameElement),10);
    driver.findElement(By.name(usernameElement)).sendKeys(userName);
    return this;
}

public DrugStoreKeeperLoginPage enterPassword(String password){
    TestApp.getInstance().waitUntilNextElementAppears(By.name(passwordElement),10);
    driver.findElement(By.name(passwordElement)).sendKeys(password);
    return this;
}

public DrugStoreKeeperLoginPage clickSignIn(){
    TestApp.getInstance().waitUntilNextElementAppears(By.xpath(signInElement),10);
    TestApp.getInstance().clickSign(By.xpath(signInElement));
    return this;
}
public DrugStoreKeeperLoginPage dropDown(){
    TestApp.getInstance().waitUntilNextElementAppears(By.xpath(dropDownUserRole), 10);
    driver.findElement(By.xpath(dropDownUserRole)).click();
    return  this;
}

public DrugStoreKeeperLoginPage clickUserRoles(){
    TestApp.getInstance().waitUntilNextElementAppears(By.xpath(userRolesElement), 10);
    driver.findElement(By.xpath(userRolesElement)).click();
    return this;
}
public  Dashboard clickSave(){
    TestApp.getInstance().waitUntilNextElementAppears(By.xpath(saveElement),10);
    driver.findElement(By.xpath(saveElement)).click();
    return new Dashboard();
}


}

