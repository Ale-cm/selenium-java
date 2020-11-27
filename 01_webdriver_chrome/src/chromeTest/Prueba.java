package chromeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba {
    public static void main(String[] args) {



        WebDriver driverCd = new ChromeDriver();
        WebDriver driverFr = new FirefoxDriver();
        WebDriver driverEd = new EdgeDriver();

        driverCd.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        driverFr.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        driverEd.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    }
}
