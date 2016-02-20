import java.util.ArrayList;
public class Bill{
	private long totalCost;
	private ArrayList<Integer> discounts;

	public void calculateTotalCost(){
		for(Integer x : discounts)
			totalCost-=x;
	}
}