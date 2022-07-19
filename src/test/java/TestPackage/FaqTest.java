package TestPackage;

import PageObject.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FaqTest {
    private WebDriver driver;

    @Test
    public void checkFaqRowOne() {

        String actual = new MainPage(driver)
                .open()
                .clickFirstFaq()
                .getFirstFAQText();

        assertEquals(originOne, actual);
    }

    @Test
    public void checkFaqRowTwo() {

        String actual = new MainPage(driver)
                .open()
                .clickSecondFaq()
                .getSecondFAQText();

        assertEquals(originTwo, actual);
    }

    @Test
    public void checkFaqRowThree() {

        String actual ThirdFAQDisplayed = new MainPage(driver)
                .open()
                .clickThirdFaq()
                .getThirdFAQText();

        assertEquals(OriginThree, actual);
    }

    @Test
    public void checkFaqRowFour() {

        String actual = new MainPage(driver)
                .open()
                .clickFourFaq()
                .getFourFAQText();

        assertEquals(originFour, actual);
    }

    @Test
    public void checkFaqRowFive() {

        String actual = new MainPage(driver)
                .open()
                .clickFiveFaq()
                .getFiveFAQText();

        assertEquals(originFive, actual);
    }

    @Test
    public void checkFaqRowSix() {

        String actual = new MainPage(driver)
                .open()
                .clickSixFaq()
                .getSixFAQText();

        assertEquals(originSix, actual);
    }

    @Test
    public void checkFaqRowSeven() {

        String actual = new MainPage(driver)
                .open()
                .clickSevenFaq()
                .getSevenFAQText();

        assertEquals (originSeven, actual);
    }

    @Test
    public void checkFaqRowEight() {

        String actual = new MainPage(driver)
                .open()
                .clickEightFaq()
                .getEightFAQText();

        assertEquals (originEight, actual);
    }

}
