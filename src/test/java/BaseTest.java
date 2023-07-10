import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;

public class BaseTest {

    static WebDriver driver;
    static String fileUnderTest;

    @BeforeTest
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String relativePath = "src/main/resources/register_task_simplified.html";
        File file = new File(relativePath);
        fileUnderTest = ("file://" + file.getAbsolutePath());
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

}