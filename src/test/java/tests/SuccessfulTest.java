package tests;


import config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SuccessfulTest {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new WebDriverProvider().get();
    }
    @Test
    void successOpenBaseURL() {
        String title = driver.getTitle();
        System.out.println(title);
        assertEquals("Jenkins", title);
    }

    @AfterEach
    void tearDown() {
        driver.close();
    }
}

