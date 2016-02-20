import java.util.ArrayList;
public class User{

	private String name, email, userName, password, loginStatus;
	private Customer c;
	
	public boolean verifyLogin(String us, String pass){
		return (us.equals(userName) && pass.equals(password));
	}
}