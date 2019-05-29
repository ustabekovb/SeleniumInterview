import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/akinzza/eclipse-workspace/SeleniumInterview/seleniumdriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		System.out.println(driver.getTitle());
		String expected = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		if(driver.getTitle().equals(expected)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
