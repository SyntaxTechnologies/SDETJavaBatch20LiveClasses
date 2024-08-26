package org.example.class10;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PolyBrowser {
    public static void main(String[] args) throws InterruptedException {

        RemoteWebDriver [] browsers={new ChromeDriver(),new FirefoxDriver(),new EdgeDriver()};
        for(RemoteWebDriver b:browsers){
            b.get("https://facebook.com");
            Thread.sleep(2000);
            b.navigate().refresh();
            b.navigate().to("https://amazon.com");
            Thread.sleep(2000);
            b.navigate().refresh();
            Thread.sleep(2000);
            b.navigate().back();
            Thread.sleep(2000);
            b.quit();

        }





    }
}
