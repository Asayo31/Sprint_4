package TestPackage;

import PageObject.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class FaqTest {
    private WebDriver driver;

    @Test
    public void checkFaqRowOne() {

        boolean isFirstFAQDisplayed = new MainPage(driver)
                .open()
                .clickFirstFaq()
                .isFirstFAQDisplayed();

        assertTrue("First FAQ row is not displayed", isFirstFAQDisplayed);
    }

    @Test
    public void checkFaqRowTwo() {

        boolean isSecondFAQDisplayed = new MainPage(driver)
                .open()
                .clickSecondFaq()
                .isSecondFAQDisplayed();

        assertTrue("First FAQ row is not displayed", isSecondFAQDisplayed);
    }

    @Test
    public void checkFaqRowThree() {

        boolean isThirdFAQDisplayed = new MainPage(driver)
                .open()
                .clickThirdFaq()
                .isThirdFAQDisplayed();

        assertTrue("First FAQ row is not displayed", isThirdFAQDisplayed);
    }

    @Test
    public void checkFaqRowFour() {

        boolean isFourthFAQDisplayed = new MainPage(driver)
                .open()
                .clickFourFaq()
                .isFourFAQDisplayed();

        assertTrue("First FAQ row is not displayed", isFourthFAQDisplayed);
    }

    @Test
    public void checkFaqRowFive() {

        boolean isFifthFAQDisplayed = new MainPage(driver)
                .open()
                .clickFiveFaq()
                .isFiveFAQDisplayed();

        assertTrue("First FAQ row is not displayed", isFifthFAQDisplayed);
    }

    @Test
    public void checkFaqRowSix() {

        boolean isSixthFAQDisplayed = new MainPage(driver)
                .open()
                .clickSixFaq()
                .isSixFAQDisplayed();

        assertTrue("First FAQ row is not displayed", isSixthFAQDisplayed);
    }

    @Test
    public void checkFaqRowSeven() {

        boolean isSeventhFAQDisplayed = new MainPage(driver)
                .open()
                .clickSevenFaq()
                .isSevenFAQDisplayed();

        assertTrue ("First FAQ row is not displayed", isSeventhFAQDisplayed);
    }

    @Test
    public void checkFaqRowEight() {

        boolean isEightFAQDisplayed = new MainPage(driver)
                .open()
                .clickEightFaq()
                .isEightFAQDisplayed();

        assertTrue ("First FAQ row is not displayed", isEightFAQDisplayed);
    }
}
