package TestPackage;
//условно готовый тест на проверку статуса заказа "не найден"
import PageObject.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class OrderStatusTest extends BaseUITest{
    private WebDriver driver;

    @Test
    public void checkOrderStatusForNonExistingOrder() {

        boolean isOrderNotFoundImageDisplayed = new MainPage(driver)
                .open()
                .clickCookie()
                .clickOrderStatusButton()
                .enterOrderNumber("123")
                .clickSearchOrderButton()
                .isOrderNotFoundImageDisplayed();

        assertTrue ("Order not found image not displayed", isOrderNotFoundImageDisplayed);

    }
}
