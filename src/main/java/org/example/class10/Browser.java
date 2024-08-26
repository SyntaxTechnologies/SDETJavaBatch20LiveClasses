package org.example.class10;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {



    public static void main(String[] args) throws InterruptedException {
        ChromeDriver c=new ChromeDriver();
        c.get("https://facebook.com");
        Thread.sleep(2000);
        c.navigate().refresh();
        c.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        c.navigate().refresh();
        Thread.sleep(2000);
        c.navigate().back();
        Thread.sleep(2000);
        c.quit();

        FirefoxDriver f=new FirefoxDriver();
        f.get("https://facebook.com");
        Thread.sleep(2000);
        f.navigate().refresh();
        f.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        f.navigate().refresh();
        Thread.sleep(2000);
        f.navigate().back();
        Thread.sleep(2000);
        f.quit();


        EdgeDriver e=new EdgeDriver();
        e.get("https://facebook.com");
        Thread.sleep(2000);
        e.navigate().refresh();
        e.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        e.navigate().refresh();
        Thread.sleep(2000);
        e.navigate().back();
        Thread.sleep(2000);
        e.quit();

    }
}
