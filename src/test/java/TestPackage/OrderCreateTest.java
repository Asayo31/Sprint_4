package TestPackage;
//условно готовый тест на проверку статуса заказа "не найден"
import PageObject.MainPage;
import PageObject.OrderStatusPage;
import TestData.ScooterUrls;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class OrderCreateTest extends BaseUITest{

    @Parameterized.Parameters
    public static Object order() {
        return new Object[][] {
                {new Order("Тест", "Юзер", "Тестовый адрес", "Автозаводская", "89607779485", "18.07.2022", "четверо суток", "black", "Оставьте у подъезда")},
                {new Order("Павел", "Викторович", "Город Тверь", "Автозаводская", "89605559485", "19.07.2022", "сутки", "grey", "Нет комментария")}
        };
    }
    private WebDriver driver;

    @Test
    public void checkOrderCreationUpButton (){
        boolean isOrderCompleteImageDisplayed = new MainPage(driver)
                .open()
                .clickOrderCreateUpButton()
                .setNameField("Ана")
                .setSurnameField("Че")
                .setRentAddressField("Москва Королева 15")
                .clickMetroStation()
                .clickMetroList()
                .setPhoneNumberField("79998887766")
                .clickNextStepOrderButton()
                .clickWhenStartButton()
                .setStartTime()
                .clickRentPeriodField()
                .setRentPeriod()
                .setScooterColor()
                .clickRentButton()
                .clickConfirmButton()
                .isOrderCompleteImageDisplayed();

        assertTrue("Order created image is not displayed",isOrderCompleteImageDisplayed);
    }

    @Test
    public void checkOrderCreationBotButton (){
        boolean isOrderCompleteImageDisplayed = new MainPage(driver)
                .open()
                .clickOrderCreateBotButton()
                .setNameField("Ана")
                .setSurnameField("Че")
                .setRentAddressField("Москва Королева 15")
                .clickMetroStation()
                .clickMetroList()
                .setPhoneNumberField("79998887766")
                .clickNextStepOrderButton()
                .clickWhenStartButton()
                .setStartTime()
                .clickRentPeriodField()
                .setRentPeriod()
                .setScooterColor()
                .clickRentButton()
                .clickConfirmButton()
                .isOrderCompleteImageDisplayed();

        assertTrue("Order created image is not displayed",isOrderCompleteImageDisplayed);
    }

}


