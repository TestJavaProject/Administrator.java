import java.util.ArrayList;

public class Administrator{
	private ArrayList<String> permissions;
	private ArrayList<String> role;

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