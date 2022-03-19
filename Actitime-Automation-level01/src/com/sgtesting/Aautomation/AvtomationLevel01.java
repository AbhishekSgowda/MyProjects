package com.sgtesting.Aautomation;

import com.sgtesting.tests.HomePage;
import com.sgtesting.tests.Initilize;
import com.sgtesting.tests.LoginLogout;
import com.sgtesting.tests.User;

public class AvtomationLevel01 {

	public static void main (String[] args) {

		try
		{
			//Create User Scenario
			Initilize.launchBrowser();
			Initilize.navigate();
			LoginLogout.login();
			HomePage.miniFlyOutWindow();
			User.createUser();
			User.deleteUser1();
			LoginLogout.logout();
			Initilize.closeApplication();



			//Modify User Scenario
			Initilize.launchBrowser();
			Initilize.navigate();
			LoginLogout.login();
			HomePage.miniFlyOutWindow();
			User.createUser();
			User.modifyUser();
			User.deleteUser();
			LoginLogout.logout();
			Initilize.closeApplication();


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
