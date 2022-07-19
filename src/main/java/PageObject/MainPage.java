package PageObject;


import Model.ScooterUrls;
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
    private final By cookie = By.xpath(".//button[@class = 'App_CookieButton__3cvqF']");
    private final String originOne = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private final String originTwo = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private final String originThree = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private final String originFour = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private final String originFive = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private final String originSix = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private final String originSeven = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private final String originEight = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    public MainPage clickCookie (){
        driver.findElement(cookie).click();
        return this;
        }
    public MainPage (WebDriver driver) {
        super(driver);
    }

    public OrderCreatePage clickOrderButtonMainpage (String button){
        if (button.equals("Up")) {driver.findElement(orderCreateUpButton).click();}
        if (button.equals("Bottom")) {
            WebElement element = driver.findElement(orderCreateBotButton);
            ((JavascriptExecutor)driver).executeScript("arguments0[.scrollIntoView", element);
            element.click();
        }
        return new OrderCreatePage(driver);
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

    public String getFirstFAQText () {
        return driver.findElement(faqAnswerOne).getText();
    } //ответ 1 FAQ

    public String getSecondFAQText () {
        return driver.findElement(faqAnswerTwo).getText();
    } //ответ 2 FAQ

    public String getThirdFAQText () {
        return driver.findElement(faqAnswerThree).getText();
    } //ответ 3 FAQ

    public String getFourFAQText () {
        return driver.findElement(faqAnswerFour).getText();
    } //ответ 4 FAQ

    public String getFiveFAQText () {
        return driver.findElement(faqAnswerFive).getText();
    } //ответ 5 FAQ

    public String getSixFAQText () {
        return driver.findElement(faqAnswerSix).getText();
    } //ответ 6 FAQ

    public String getSevenFAQText () {
        return driver.findElement(faqAnswerSeven).getText();
    } //ответ 7 FAQ

    public String getEightFAQText () {
        return driver.findElement(faqAnswerEight).getText();
    } //ответ 8 FAQ

}
