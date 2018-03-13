package br.com.sicredi.automation_web.pages.selenium;

import org.openqa.selenium.support.PageFactory;

import br.com.sicredi.automation_web.util.TestRule;

public class WoopHomePage extends WoopHomePageElementMap {

	public WoopHomePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessarLogin() {
		moveToElement(btnLogin);
		btnLogin.click();
		logPrint("Acessou a tela de Login");
	}

	public void efetuaLogin() {
		user.sendKeys("himeneutst1@mailinator.com");
		password.sendKeys("Minhasenha123");
		logPrint("Dados informados corretamente");
		btnEntrar.click();
	}

	public void validaLogin() {
		waitElement(userLogado, 10);
		moveToElement(userLogado);
		if (userLogado.isDisplayed()) {
			logPrint("Login efetuado corretamente");
		}
	}

}