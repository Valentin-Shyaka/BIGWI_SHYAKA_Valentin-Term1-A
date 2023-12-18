// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.web.server.LocalServerPort;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// public class CalcApplicationE2ETests {

//     @LocalServerPort
//     private int port;

//     private WebDriver driver;

//     @BeforeEach
//     public void setUp() {
        
//         System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//         driver = new ChromeDriver();
//     }

//     @AfterEach
//     public void tearDown() {
      
//         if (driver != null) {
//             driver.quit();
//         }
//     }

//     @Test
//     public void testDoMathOperation_E2E() {
//         driver.get("http://localhost:" + port + "/");  

        
//         WebElement operand1Input = driver.findElement(By.id("operand1"));
//         WebElement operand2Input = driver.findElement(By.id("operand2"));
//         WebElement operationInput = driver.findElement(By.id("operation"));
//         WebElement calculateButton = driver.findElement(By.id("calculateButton"));

//         operand1Input.sendKeys("3");
//         operand2Input.sendKeys("3");
//         operationInput.sendKeys("+");
//         calculateButton.click();

//         WebElement resultElement = driver.findElement(By.id("result"));
//         String resultText = resultElement.getText();
//         assertEquals("6.0", resultText);
//     }
// }
