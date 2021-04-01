package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver aDriver;
    private static String currentDir;

    public Browser(WebDriver aDriver) {
        this.aDriver = aDriver;
    }

    public static void setSystemsProperties() {
        currentDir = System.getProperty("user.dir");
        if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", currentDir
                    + "/drivers/chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver", currentDir
                    + "/drivers/chromedriver");
        }
    }

    public static WebDriver initialiseDriver() {
        setSystemsProperties();
        aDriver = new ChromeDriver();
        aDriver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        return aDriver;
    }

    public static void quiteDriver() {
        try {
            aDriver.close();
            if (aDriver != null) {
                aDriver.quit();
                aDriver = null;
            }

        } catch (UnreachableBrowserException e) {
            System.out.println("Browser has already Shutdown");
        }

    }
}
