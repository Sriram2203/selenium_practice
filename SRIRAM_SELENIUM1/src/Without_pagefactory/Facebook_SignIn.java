package Without_pagefactory;

import org.openqa.selenium.By;

public class Facebook_SignIn
{

	public static By Email=By.xpath("//input[@id='email']");
	public static By Password=By.xpath("//input[contains(@data-testid,'royal_pass')]");
	public static By login_Btn=By.xpath("//button[contains(@value,'1')]");
	public static By Forgotten_password_link=By.linkText("Forgotten password?");
	
}
