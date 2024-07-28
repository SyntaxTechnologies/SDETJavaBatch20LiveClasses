package org.example.class5;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstScript {
    public static void main(String[] args) {

        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.navigate().to("https://facebook.com");
        chromeDriver.quit();
    }
}
