package inspectedElementsPackage;

public class LoginElements {
	
	public String email="//*[@id=\"email\"]";
	public String password= "//*[@id=\"pass\"]";
	public String login = "//div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]";
	public String noEmailNoPasswordVerification="//*[@id=\"email_container\"]/div[2]";
	
	
// second page of facbook login
	
	public String email2="//*[@id=\"email\"]";
	public String password2= "//*[@id=\"pass\"]";
	public String login2 = "//*[@id=\"loginbutton\"]";
	public String noPasswordVarification = "//*[@id=\"loginform\"]/div[2]/div[2]";
	
	public String popupClose = "/html/body/div[3]/div[2]/div/div/div/div/div[1]/div";
	
	
	public String genVarification = "//*[@id=\"error_box\"]/div[1]";

}
