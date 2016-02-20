import java.util.ArrayList;

public class Administrator extends User{
	private ArrayList<String> permissions;
	private ArrayList<String> role;
	private User us;

	public Administrator(User u){
		us = u;
		permissions = new ArrayList<String>();
		role = new ArrayList<String>();
	}

	public void addRole(String role){
		this.role.add(role);
	}
	
	public void removeRole(String role){
		this.role.remove(role);
	}

	public void addPermission(String permission){
		permissions.add(permission);
	}
	
	public void removePermission(String permission){
		permissions.remove(permission);
	}

}