package com.sgtesting.tests;

import org.openqa.selenium.By;

public class HomePage extends Initilize{
	public static void miniFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);  
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
