package br.com.sicredi.automation_web.steps.selenium;

import br.com.sicredi.automation_web.pages.selenium.WoopHomePage;
import br.com.sicredi.automation_web.util.TestRule;
import cucumber.api.java.gl.E;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class WoopHomePageSteps {
	@Dado("que estou na HomePage do Woop")
	public void acessarWoopHomePage() {
		TestRule.openApplicationChrome("https://www.tst.woopsicredi.com/");
	}

	@Quando("clico no botao Login")
	public void acessaLogin() {
		WoopHomePage woopHomePage = new WoopHomePage();
		woopHomePage.acessarLogin();
	}

	@E("preencho os campos E-mail e Senha com dados validos")
	public void efetuaLogin() {
		WoopHomePage woopHomePage = new WoopHomePage();
		woopHomePage.efetuaLogin();
	}

	@Entao("devo conseguir efetuar login corretamente")
	public void validaLogin() {
		WoopHomePage woopHomePage = new WoopHomePage();
		woopHomePage.validaLogin();
	}

}
