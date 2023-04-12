package greens.miniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniElements {

	
	@FindBy(id = "uid")private WebElement user;
	
	@FindBy(id = "passw")private WebElement pwd;
	
	@FindBy(name = "btnSubmit")private WebElement login;
	
	
	@FindBy(id = "_ctl0__ctl0_Content_Main_message")private WebElement failmsg;
	
	
	@FindBy(xpath = "//h2[text()='Congratulations! ']")private WebElement passmsg;
	
	@FindBy(id = "MenuHyperLink1")private WebElement Accsummary;
	
	@FindBy(id = "listAccounts")private WebElement drop;
	
	@FindBy(id = "btnGetAccount")private WebElement go;
	
	@FindBy(xpath = "(//td[@align='right'])[4]")private WebElement availBalance;
	
    @FindBy(id = "MenuHyperLink3")private WebElement transferfund;
	
	@FindBy(id = "toAccount")private WebElement dropacc;
	
	@FindBy(id = "transferAmount")private WebElement transferamount;
	
	@FindBy(id = "transfer")private WebElement transfer;
	
	@FindBy(id = "_ctl0__ctl0_Content_Main_postResp")private WebElement accountmsg;
	
	@FindBy(id = "MenuHyperLink2")private WebElement recenttrans;
	
	@FindBy(xpath = "(//td[@align='right'])[3]")private WebElement twotransac;
	
	@FindBy(id = "HyperLink3")private WebElement contact;
	
	@FindBy(xpath = "//a[text()='online form']")private WebElement onlineform;
	
	@FindBy(name = "name")private WebElement name;
	
	@FindBy(name = "email_addr")private WebElement email;
	
	@FindBy(name = "submit")private WebElement submit;
	
	@FindBy(xpath = "//h1[text()='Thank You']")private WebElement Thankyou;
	
	@FindBy(id = "LoginLink")private WebElement signoff;
	

	public MiniElements(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	//getters

	public WebElement getUser() {
		return user;
	}

	public WebElement getFailmsg() {
		return failmsg;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getAccountmsg() {
		return accountmsg;
	}

	public WebElement getRecenttrans() {
		return recenttrans;
	}

	public WebElement getLogin() {
		return login;
	}
	 
	 
	 public WebElement getPassmsg() {
			return passmsg;
		}
	 public WebElement getAccsummary() {
			return Accsummary;
		}
		public WebElement getDrop() {
			return drop;
		}

		public WebElement getGo() {
			return go;
		
		}
		public WebElement getAvailBalance() {
			return availBalance;
		}

		public WebElement getTransferfund() {
			return transferfund;
		}

		public WebElement getDropacc() {
			return dropacc;
		}

		public WebElement getTransferamount() {
			return transferamount;
		}

		public WebElement getTransfer() {
			return transfer;
		}

		public WebElement getTwotransac() {
			return twotransac;
		}

		public WebElement getContact() {
			return contact;
		}

		public WebElement getOnlineform() {
			return onlineform;
		}

		public WebElement getName() {
			return name;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getSubmit() {
			return submit;
		}

		public WebElement getThankyou() {
			return Thankyou;
		}

		public WebElement getSignoff() {
			return signoff;
		}
		
		}
