package pageObject;


import model.ScooterUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

public class MainPage extends BasePage{

    private final By orderCreateUpButton = By.className ("Button_Button__ra12g");
    private final By orderCreateBotButton = By.xpath (".//button[@class = 'Button_Button__ra12g' and 'Button_Middle__1CSJM']");
    private final By orderStatusButton = By.className("Header_Link__1TAG7");
    private final By orderNumberInput = By.cssSelector(".Header_Link__1TAG7");
    private final By searchOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");
    private final By firstFaqButton = By.xpath ("//*[@id=\"accordion__heading-0\"]");
    private final By secondFaqButton = By.xpath(".//div[@id = 'accordion__heading-1']");
    private final By thirdFaqButton = By.xpath(".//div[@id = 'accordion__heading-2']");
    private final By fourFaqButton = By.xpath(".//div[@id = 'accordion__heading-3']");
    private final By fiveFaqButton = By.xpath(".//div[@id = 'accordion__heading-4']");
    private final By sixFaqButton = By.xpath(".//div[@id = 'accordion__heading-5']");
    private final By sevenFaqButton = By.xpath(".//div[@id = 'accordion__heading-6']");
    private final By eightFaqButton = By.xpath(".//div[@id = 'accordion__heading-7']");
    private final By faqAnswerOne = By.xpath ("//*[@id=\"accordion__panel-0\"]");
    private final By faqAnswerTwo = By.xpath ("//*[@id=\"accordion__panel-1\"]");
    private final By faqAnswerThree = By.xpath ("//*[@id=\"accordion__panel-2\"]");
    private final By faqAnswerFour = By.xpath ("//*[@id=\"accordion__panel-3\"]");
    private final By faqAnswerFive = By.xpath ("//*[@id=\"accordion__panel-4\"]");
    private final By faqAnswerSix = By.xpath ("//*[@id=\"accordion__panel-5\"]");
    private final By faqAnswerSeven = By.xpath ("//*[@id=\"accordion__panel-6\"]");
    private final By faqAnswerEight = By.xpath ("//*[@id=\"accordion__panel-7\"]");
    private final By cookie = By.xpath(".//button[@class = 'App_CookieButton__3cvqF']");
    public final static String originOne = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public final static String originTwo = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public final static String originThree = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public final static String originFour = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public final static String originFive = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public final static String originSix = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public final static String originSeven = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public final static String originEight = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    public MainPage clickCookie (){
        driver.findElement(cookie).click();
        return this;
        }
    public MainPage (WebDriver driver) {
        super(driver);
    }

    public OrderCreatePage clickOrderButtonMainpage (String button){
        if (button.equals("Up")) {
            driver.findElement(orderCreateUpButton).click();
            return new OrderCreatePage(driver);}
        if (button.equals("Bottom")) {
            WebElement element = driver.findElement(orderCreateBotButton);
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
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
        final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(searchOrderButton)).click();
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
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2300)");
        WebElement element = driver.findElement(firstFaqButton);
        element.click();
        return this;
    } //нажать 1 FAQ

    public MainPage clickSecondFaq () {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2300)");
        WebElement element = driver.findElement(secondFaqButton);
        element.click();
        return this;
    } //нажать 2 FAQ

    public MainPage clickThirdFaq () {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2300)");
        WebElement element = driver.findElement(thirdFaqButton);
        element.click();
        return this;
    } //нажать 3 FAQ

    public MainPage clickFourFaq () {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2300)");
        WebElement element = driver.findElement(fourFaqButton);
        element.click();
        return this;
    } //нажать 4 FAQ

    public MainPage clickFiveFaq () {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2300)");
        WebElement element = driver.findElement(fiveFaqButton);
        element.click();
        return this;
    } //нажать 5 FAQ

    public MainPage clickSixFaq () {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2300)");
        WebElement element = driver.findElement(sixFaqButton);
        element.click();
        return this;
    } //нажать 6 FAQ

    public MainPage clickSevenFaq () {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2300)");
        WebElement element = driver.findElement(sevenFaqButton);
        element.click();
        return this;
    } //нажать 7 FAQ

    public MainPage clickEightFaq () {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2300)");
        WebElement element = driver.findElement(eightFaqButton);
        element.click();
        return this;
    } //нажать 8 FAQ

    public String getFirstFAQText () {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerOne));
        return driver.findElement(faqAnswerOne).getText();
    } //ответ 1 FAQ

    public String getSecondFAQText () {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerTwo));
        return driver.findElement(faqAnswerTwo).getText();
    } //ответ 2 FAQ

    public String getThirdFAQText () {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerThree));
        return driver.findElement(faqAnswerThree).getText();
    } //ответ 3 FAQ

    public String getFourFAQText () {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerFour));
        return driver.findElement(faqAnswerFour).getText();
    } //ответ 4 FAQ

    public String getFiveFAQText () {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerFive));
        return driver.findElement(faqAnswerFive).getText();
    } //ответ 5 FAQ

    public String getSixFAQText () {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerSix));
        return driver.findElement(faqAnswerSix).getText();
    } //ответ 6 FAQ

    public String getSevenFAQText () {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerSeven));
        return driver.findElement(faqAnswerSeven).getText();
    } //ответ 7 FAQ

    public String getEightFAQText () {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerEight));
        return driver.findElement(faqAnswerEight).getText();
    } //ответ 8 FAQ



    //правки
    public void scrollToBottom() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2300)");
    }

    public String getCurrentAnswerText() {
        final By answerLocator = By.xpath("//div[contains(@class, 'accordion__panel') and not(@hidden)]/p");
        final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.textMatches(answerLocator, Pattern.compile(".+")));
        return driver.findElement(answerLocator).getText();
    }

    public void clickQuestion(int item) {
        final By locator = By.xpath("//div[contains(@id, 'accordion__heading-')]");
        final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        final WebElement el = driver.findElements(locator).get(item);
        wait.until(ExpectedConditions.elementToBeClickable(el)).click();
    }
}
