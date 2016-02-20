import java.util.ArrayList;
public class User{

	private String name, email, userName, password, loginStatus;
	private Customer c;
	
	public User(Administrator a, String nm, String em, String un, String pass, String ls){
		this.a = a; name = nm; email = em; userName = un; password = pass; loginStatus = ls;
	}
	
	public boolean verifyLogin(String us, String pass){
		return (us.equals(userName) && pass.equals(password));
	}
}