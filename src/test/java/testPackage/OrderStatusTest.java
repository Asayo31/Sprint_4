package testPackage;
//условно готовый тест на проверку статуса заказа "не найден"
import pageObject.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class OrderStatusTest extends BaseUITest{

    @Test
    public void checkOrderStatusForNonExistingOrder() {

        boolean isOrderNotFoundImageDisplayed = new MainPage(driver)
                .open()
                .clickOrderStatusButton()
                .enterOrderNumber("123")
                .clickSearchOrderButton()
                .isOrderNotFoundImageDisplayed();

        assertTrue ("Order not found image not displayed", isOrderNotFoundImageDisplayed);

    }
}
