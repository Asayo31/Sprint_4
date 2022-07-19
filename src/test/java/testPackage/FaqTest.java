package testPackage;

import pageObject.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static pageObject.MainPage.*;

public class FaqTest extends BaseUITest{


    @Test
    public void checkFaqRowOne() {

        String actual = new MainPage(driver)
                .open()
                .clickCookie()
                .clickFirstFaq()
                .getFirstFAQText();

        assertEquals(originOne, actual);
    }

    @Test
    public void checkFaqRowTwo() {

        String actual = new MainPage(driver)
                .open()
                //.clickCookie()
                .clickSecondFaq()
                .getSecondFAQText();

        assertEquals(originTwo, actual);
    }

    @Test
    public void checkFaqRowThree() {

        String actual = new MainPage(driver)
                .open()
                //.clickCookie()
                .clickThirdFaq()
                .getThirdFAQText();

        assertEquals(originThree, actual);
    }

    @Test
    public void checkFaqRowFour() {

        String actual = new MainPage(driver)
                .open()
                //.clickCookie()
                .clickFourFaq()
                .getFourFAQText();

        assertEquals(originFour, actual);
    }

    @Test
    public void checkFaqRowFive() {

        String actual = new MainPage(driver)
                .open()
                //.clickCookie()
                .clickFiveFaq()
                .getFiveFAQText();

        assertEquals(originFive, actual);
    }

    @Test
    public void checkFaqRowSix() {

        String actual = new MainPage(driver)
                .open()
                //.clickCookie()
                .clickSixFaq()
                .getSixFAQText();

        assertEquals(originSix, actual);
    }

    @Test
    public void checkFaqRowSeven() {

        String actual = new MainPage(driver)
                .open()
                //.clickCookie()
                .clickSevenFaq()
                .getSevenFAQText();

        assertEquals (originSeven, actual);
    }

    @Test
    public void checkFaqRowEight() {

        String actual = new MainPage(driver)
                .open()
                //.clickCookie()
                .clickEightFaq()
                .getEightFAQText();

        assertEquals (originEight, actual);
    }

}
