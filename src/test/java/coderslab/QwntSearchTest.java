package coderslab;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QwntSearchTest {
    @Test
    public void shouldSearchWithQwant(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qwant.com/?l=pl/");
        WebElement searchInputBox = driver.findElement(By.name("q"));
        searchInputBox.clear();
        searchInputBox.sendKeys("W pustyni i w puszczy");
        searchInputBox.submit();
    }
}


//public void shouldSearchWithDuckDuckGo(){
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://duckduckgo.com/");
//        WebElement searchInputBox = driver.findElement(By.id("search_form_input_homepage"));
//        searchInputBox.clear();
//        searchInputBox.sendKeys("W pustyni i w puszczy");
//        searchInputBox.submit();
//        //driver.quit();
//    }
//}