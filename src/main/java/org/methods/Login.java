package org.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Login {

    public static void login(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-251597158%3A1677076721038248&continue=http%3A%2F%2Fdrive.google.com%2F%3Futm_source%3Den&ltmpl=drive&passive=true&service=wise&usp=gtd&utm_campaign=web&utm_content=gotodrive&utm_medium=button&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHf7Ys0bX7-bueYTV46BO1TyCWd8y8KCm1MQth1GJQp7vOksC_1gZMYdI_qfnTGmxgPtgKba");

        WebElement login =driver.findElement(By.xpath("(//input[@id='identifierId'])[1]"));
        login.sendKeys("???\n");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement password =driver.findElement(By.xpath("(//input[@name='Passwd'])[1]"));
        password.sendKeys("???\n");
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
    }
}
