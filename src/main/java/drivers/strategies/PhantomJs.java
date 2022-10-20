package drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PhantomJs implements DriverStrategy {
    public WebDriver setStrategy() {
        System.setProperty("phantomjs.binary.path", "src/main/resources/phantomjs.exe");
        //Help us to set options for our driver (like chromeOption)
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //make sure that java script is enabled
        desiredCapabilities.setJavascriptEnabled(true);
        WebDriver driver = new PhantomJSDriver(desiredCapabilities);

        return driver;
    }
}
