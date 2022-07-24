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
    private final By nextStepButton = By.xpath(".//button[text()='Далее']");
    private final By startTimeField = By.xpath("//div[@role='button' and contains(@class, 'react-datepicker__day--027')]");
    private final By whenStartButton = By.xpath(".//input[@type='text' and contains(@placeholder, 'Когда привезти')]");
    private final By rentPeriodField = By.xpath(".//span[@class = 'Dropdown-arrow']");
    private final By rentPeriod = By.xpath(".//div[@class = 'Dropdown-menu']/div[@role = 'option' and contains(@class, 'Dropdown-option')]");
    private final By ScooterColor = By.xpath(".//input[@id = 'black']");
    private final By rentButton = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Buttons__1xGrp > button:nth-child(2)");
    private final By confirmButton = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Modal__YZ-d3 > div.Order_Buttons__1xGrp > button:nth-child(2)");
    private final By orderCompleteImage = By.xpath("//div[text()='Заказ оформлен']");

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
        //driver.findElement(metroList).sendKeys(stationName);
        driver.findElement(By.xpath(".//div/ul/li[5]/button")).click();
        return this;
    }

    public OrderCreatePage setPhoneNumberField(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        return this;
    } //внести номер телефона

    public OrderCreatePage clickNextStepOrderButton(){
        driver.findElement(nextStepButton).click();
        driver.findElement(whenStartButton).click();
        return this;
    } //переход на второй шаг оформления заказа

    /*public OrderCreatePage clickWhenStartButton(){
        driver.findElement(whenStartButton).click();
        return new OrderCreatePage(driver);
    }*/

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

