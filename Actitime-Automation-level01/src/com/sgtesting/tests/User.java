package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


public class User extends Initilize {

	public static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Abhishek");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("abhi@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("Abhishek");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Password123");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Password123");
			Thread.sleep(2000);
			oBrowser.findElement(By.className("buttonTitle")).click();	
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Gowda, Abhishek']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("mohan");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("mohan");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("Password1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Password1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Gowda, Abhishek']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);    		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Gowda, mohan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);    		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
