package pageObjects;

import Selectors.LoginPageSelectors;
import automationFramework.WebElementsHandler;

public class LoginPage {
	
	public static LoginCommand LoginAs(String userName) {
		LoginPage lp = new LoginPage();
		return lp.new LoginCommand(userName);
	}

	public class LoginCommand {
		private String userName;
		private String password;
		
		public LoginCommand(String userName){
			this.userName = userName;			
		}
		
		public LoginCommand WithPassword(String password) {
			this.password = password;
			return this;
		}

		public void Login() {
			WebElementsHandler handler = new WebElementsHandler();
			handler.typeInputText(LoginPageSelectors.loginInput, this.userName);
			handler.typeInputText(LoginPageSelectors.passwordInput, this.password);
			handler.clickInputButtonByLocator(LoginPageSelectors.loginButton);
		}
	}
}
	
