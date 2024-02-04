package lk.gov.health.swastha;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilis.TestApp;

public class TestCase1 {

    DrugStoreKeeperLoginPage drugStoreKeeperLoginPage;
    Dashboard dashboard;
    Orders orders;
    OrderList orderList;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        drugStoreKeeperLoginPage = new DrugStoreKeeperLoginPage();
    }

    @Test
    public void testCase1() {
        dashboard = drugStoreKeeperLoginPage.enterUserName("671240499V").enterPassword("12345678").clickSignIn().dropDown().clickUserRoles().clickSave();
        orders= dashboard.clickOk().clickOrdersInNavigationBar().clickItemWiseOrders().selectWareHouse().wareHouse().selectDateDropdown().selectedDate().daysMonthDropdown().selectedDateMonth().clickGenerate().orderQuantity("20").clickCart();
        orderList=orders.clickOrderList();
    }

    @AfterMethod
    public void tearDown() {
        //TestApp.getInstance().closeBrowser();

    }
}
