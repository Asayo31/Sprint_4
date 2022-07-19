package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderCreatePage extends BasePage {

    public OrderCreatePage (WebDriver driver) {

        super(driver);
    }

    private final By nameField = By.xpath (".//input[@placeholder = '* Имя']");

    private final By surnameField = By.xpath (".//input[@placeholder = '* Фамилия']");

    private final By addressField = By.xpath (".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private final By metroList = By.xpath(".//input[contains(@placeholder, 'Станция метро')]");
    private final By phoneNumberField = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private final By nextStepButton = By.xpath(".//button[@class ='Button_Button__ra12g' and 'Button_Middle__1CSJM']");
    private final By startTimeField = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    private final By whenStartButton = By.xpath(".//div[@class = 'react-datepicker__day--029']");
    private final By rentPeriodField = By.className("Dropdown-placeholder");
    private final By rentPeriod = By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'четверо суток')");
    private final By ScooterColor = By.xpath(".//input[@id = * and @class = 'Checkbox_Input__14A2w']");
    private final By rentButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    private final By confirmButton = By.xpath(".//button[@class = 'Button_Button__ra12g' and 'Button_Middle__1CSJM']");
    private final By orderCompleteImage = By.className("Order_ModalHeader__3FDaJ");

    public OrderCreatePage setNameField (String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    } //заполнить поле имя

    public OrderCreatePage setSurnameField (String surname) {
        driver.findElement(surnameField).sendKeys(surname);
        return this;
    } //заполнить поле фамилия

    public boolean isOrderCompleteImageDisplayed () {
        return driver.findElement(orderCompleteImage).isDisplayed();
    } //отображается ли картинка "заказ оформлен"

    public OrderCreatePage setRentAddressField (String address) {
        driver.findElement(addressField).sendKeys(address);
        return this;
    } //внести адрес

    public OrderCreatePage clickMetroStation(String stationName){
        driver.findElement(metroList).click();
        driver.findElement(metroList).sendKeys(stationName);
        driver.findElement(By.xpath(".//button")).click();
        return this;
    }

    public OrderCreatePage setPhoneNumberField(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        return this;
    } //внести номер телефона

    public OrderCreatePage clickNextStepOrderButton(){
        driver.findElement(nextStepButton).click();
        return new OrderCreatePage(driver);
    } //переход на второй шаг оформления заказа

    public OrderCreatePage clickWhenStartButton(){
        driver.findElement(whenStartButton).click();
        return new OrderCreatePage(driver);
    }

    public OrderCreatePage setStartTime() {
        driver.findElement(startTimeField).click();
        return this;
    }

    public OrderCreatePage clickRentPeriodField(){
        driver.findElement(rentPeriodField).click();
        return new OrderCreatePage(driver);
    }

    public OrderCreatePage setRentPeriod(){
        driver.findElement(rentPeriod).click();
        return this;
    }

    public OrderCreatePage setScooterColor(){
        driver.findElement(ScooterColor).click();
        return new OrderCreatePage(driver);
    }

    public OrderCreatePage clickRentButton(){
        driver.findElement(rentButton).click();
        return new OrderCreatePage(driver);
    }

    public OrderCreatePage clickConfirmButton(){
        driver.findElement(confirmButton).click();
        return new OrderCreatePage(driver);
    }

}

