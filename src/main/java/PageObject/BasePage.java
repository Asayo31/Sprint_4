package PageObject;

import Model.Order;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected final WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }
    private static final String MAIN_URL = "https://qa-scooter.praktikum-services.ru";
    private static final String YANDEX_URL = "https://yandex.ru";
    private static final String ORDER_URL = "https://qa-scooter.praktikum-services.ru/order";

    protected String getPageAddress(){
        return MAIN_URL;
    }

}
