package TestPackage;
//условно готовый тест на проверку статуса заказа "не найден"

import Model.Order;
import PageObject.MainPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class OrderCreateTest extends BaseUITest {

    private final Order order;

    public OrderCreateTest(Order order) {
        this.order = order;
    }

    @Parameterized.Parameters
    public static Object[][] order() {
        return new Object[][]{
                {new Order("Up", "Ана", "Че", "Москва Королева 15", "Фрунзенская", "79998887766")},
                {new Order("Bottom", "Тест", "Тестов", "Казань Баумана 3", "Кунцевская", "79008007060")}
        };
    }

    private WebDriver driver;

    @Test
    public void checkOrderCreationUpButton() {
        boolean isOrderCompleteImageDisplayed = new MainPage(driver)
                .open()
                .clickCookie()
                .clickOrderButtonMainpage(order.getOrderButton())
                .setNameField(order.getName())
                .setSurnameField(order.getSurname())
                .setRentAddressField(order.getAddress())
                .clickMetroStation(order.getMetroStation())
                .setPhoneNumberField(order.getPhoneNumber())
                .clickNextStepOrderButton()
                .clickWhenStartButton()
                .setStartTime()
                .clickRentPeriodField()
                .setRentPeriod()
                .setScooterColor()
                .clickRentButton()
                .clickConfirmButton()
                .isOrderCompleteImageDisplayed();

        assertTrue("Order created image is not displayed", isOrderCompleteImageDisplayed);
    }

    @Test
    public void checkOrderCreationBotButton() {
        boolean isOrderCompleteImageDisplayed = new MainPage(driver)
                .open()
                .clickCookie()
                .clickOrderButtonMainpage(order.getOrderButton())
                .setNameField(order.getName())
                .setSurnameField(order.getSurname())
                .setRentAddressField(order.getAddress())
                .clickMetroStation(order.getMetroStation())
                .setPhoneNumberField(order.getPhoneNumber())
                .clickNextStepOrderButton()
                .clickWhenStartButton()
                .setStartTime()
                .clickRentPeriodField()
                .setRentPeriod()
                .setScooterColor()
                .clickRentButton()
                .clickConfirmButton()
                .isOrderCompleteImageDisplayed();

        assertTrue("Order created image is not displayed", isOrderCompleteImageDisplayed);
    }

}


