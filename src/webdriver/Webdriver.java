/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webdriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Bolla
 */
public class Webdriver {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","E:\\School\\year 4\\semester2\\quality assurance\\project\\phase 2\\code\\selenium driver\\code\\\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
    }
}
