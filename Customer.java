import java.util.ArrayList;
public class Customer extends User{
	private long creditCard;
	private Arraylist<String> interests;
	private String postalAddress;

	public void addInterests(String interest){
		interests.add(interest);
	}
	private void removeInterest(String interest){
		interests.remove(interest);
	}

}