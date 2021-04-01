package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils extends Browser {
    public BrowserUtils() {
        super(aDriver);
    }

    public static void selectListOption(WebElement element, String option) {
        element = new WebDriverWait(aDriver, 5L).
                until(ExpectedConditions.visibilityOf(element));
        Select options = new Select(element);
        options.selectByVisibleText(option);

    }

    public static void clickWeBElement(WebElement element) {
        new WebDriverWait(aDriver, 5L).
                until(ExpectedConditions.visibilityOf(element));
        element.click();;

    }

    public static void clickLink(String link) {
        WebElement element = new WebDriverWait(aDriver, 5L).
                until(ExpectedConditions.visibilityOfElementLocated(By.linkText(link)));
        element.click();
    }

    public static void setText(WebElement textField, String text) {
        textField = new WebDriverWait(aDriver, 5L).
                until(ExpectedConditions.visibilityOf(textField));
        textField.clear();
        textField.sendKeys(text);
    }
}
