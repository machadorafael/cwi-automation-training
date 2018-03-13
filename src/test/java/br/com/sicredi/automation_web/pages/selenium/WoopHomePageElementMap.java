package br.com.sicredi.automation_web.pages.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.sicredi.automation_web.pages.BasePage;

public class WoopHomePageElementMap extends BasePage {

	@FindBy(id = "landingComponentLoginButton")
	protected WebElement btnLogin;

	@FindBy(id = "loginFormInputUser")
	protected WebElement user;

	@FindBy(id = "loginFormInputPassword")
	protected WebElement password;

	@FindBy(id = "loginComponentLoginEmailSenha")
	protected WebElement btnEntrar;

	@FindBy(xpath = "//*[@id=\"userMenu\"]/li/a/span")
	protected WebElement userLogado;

}