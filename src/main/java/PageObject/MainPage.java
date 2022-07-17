package PageObject;


import TestData.ScooterUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{

    private final By orderCreateUpButton = By.className ("Button_Button__ra12g");
    private final By orderCreateBotButton = By.className ("Button_Button__ra12g Button_Middle__1CSJM");
    private final By orderStatusButton = By.className("Header_Link__1TAG7");
    private final By orderNumberInput = By.xpath(".//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    private final By searchOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");
    private final By firstFaqButton = By.xpath(".//div[@id = 'accordion__heading-8']");
    private final By secondFaqButton = By.xpath(".//div[@id = 'accordion__heading-9']");
    private final By thirdFaqButton = By.xpath(".//div[@id = 'accordion__heading-10']");
    private final By fourFaqButton = By.xpath(".//div[@id = 'accordion__heading-11']");
    private final By fiveFaqButton = By.xpath(".//div[@id = 'accordion__heading-12']");
    private final By sixFaqButton = By.xpath(".//div[@id = 'accordion__heading-13']");
    private final By sevenFaqButton = By.xpath(".//div[@id = 'accordion__heading-14']");
    private final By eightFaqButton = By.xpath(".//div[@id = 'accordion__heading-15']");
    private final By faqAnswerOne = By.xpath (".//div[@id = 'accordion__panel-8']");
    private final By faqAnswerTwo = By.xpath (".//div[@id = 'accordion__panel-9']");
    private final By faqAnswerThree = By.xpath (".//div[@id = 'accordion__panel-10']");
    private final By faqAnswerFour = By.xpath (".//div[@id = 'accordion__panel-11']");
    private final By faqAnswerFive = By.xpath (".//div[@id = 'accordion__panel-12']");
    private final By faqAnswerSix = By.xpath (".//div[@id = 'accordion__panel-13']");
    private final By faqAnswerSeven = By.xpath (".//div[@id = 'accordion__panel-14']");
    private final By faqAnswerEight = By.xpath (".//div[@id = 'accordion__panel-15']");

    public MainPage (WebDriver driver) {
        super(driver);
    }

    public void clickOrderButtonMainpage (String button){
        if (button == "Up") {driver.findElement(orderCreateUpButton).click();}
        if (button == "Bottom") {
            WebElement element = driver.findElement(orderCreateBotButton);
            ((JavascriptExecutor)driver).executeScript("arguments0[.scrollIntoView", element);
            element.click();
        }
    }

    public MainPage clickOrderStatusButton(){
        driver.findElement(orderStatusButton).click();
        return this;
    } //проверить заказ

    public MainPage enterOrderNumber (String orderNumber) {
        driver.findElement(orderNumberInput).sendKeys(orderNumber);
        return this;
    } //ввести номер для проверки

    public OrderStatusPage clickSearchOrderButton(){
        driver.findElement(searchOrderButton).click();
        return new OrderStatusPage(driver);
    } //начать поиск

    public MainPage open(){
        driver.get(ScooterUrls.MAIN_URL);
        return this;
    } //открытие страницы главной

    public OrderCreatePage clickOrderCreateUpButton () {
        driver.findElement(orderCreateUpButton).click();
        return new OrderCreatePage(driver);
    } //нажать кнопку создания заказа сверху

    public OrderCreatePage clickOrderCreateBotButton () {
        driver.findElement(orderCreateBotButton).click();
        return new OrderCreatePage(driver);
    } //нажать кнопку создания заказа снизу

    public MainPage clickFirstFaq () {
        driver.findElement(firstFaqButton).click();
        return this;
    } //нажать 1 FAQ

    public MainPage clickSecondFaq () {
        driver.findElement(secondFaqButton).click();
        return this;
    } //нажать 2 FAQ

    public MainPage clickThirdFaq () {
        driver.findElement(thirdFaqButton).click();
        return this;
    } //нажать 3 FAQ

    public MainPage clickFourFaq () {
        driver.findElement(fourFaqButton).click();
        return this;
    } //нажать 4 FAQ

    public MainPage clickFiveFaq () {
        driver.findElement(fiveFaqButton).click();
        return this;
    } //нажать 5 FAQ

    public MainPage clickSixFaq () {
        driver.findElement(sixFaqButton).click();
        return this;
    } //нажать 6 FAQ

    public MainPage clickSevenFaq () {
        driver.findElement(sevenFaqButton).click();
        return this;
    } //нажать 7 FAQ

    public MainPage clickEightFaq () {
        driver.findElement(eightFaqButton).click();
        return this;
    } //нажать 8 FAQ

    public boolean isFirstFAQDisplayed () {
        return driver.findElement(faqAnswerOne).isDisplayed();
    } //ответ 1 FAQ

    public boolean isSecondFAQDisplayed () {
        return driver.findElement(faqAnswerTwo).isDisplayed();
    } //ответ 2 FAQ

    public boolean isThirdFAQDisplayed () {
        return driver.findElement(faqAnswerThree).isDisplayed();
    } //ответ 3 FAQ

    public boolean isFourFAQDisplayed () {
        return driver.findElement(faqAnswerFour).isDisplayed();
    } //ответ 4 FAQ

    public boolean isFiveFAQDisplayed () {
        return driver.findElement(faqAnswerFive).isDisplayed();
    } //ответ 5 FAQ

    public boolean isSixFAQDisplayed () {
        return driver.findElement(faqAnswerSix).isDisplayed();
    } //ответ 6 FAQ

    public boolean isSevenFAQDisplayed () {
        return driver.findElement(faqAnswerSeven).isDisplayed();
    } //ответ 7 FAQ

    public boolean isEightFAQDisplayed () {
        return driver.findElement(faqAnswerEight).isDisplayed();
    } //ответ 8 FAQ

}
