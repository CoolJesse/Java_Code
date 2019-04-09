import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		
		Team theMariners = new Baseball_Team("The Mariners");
		Team theSonics = new Basketball_Team("The Super Sonics");
		Team theSeahawks = new Football_Team("The Seahawks");
		Team theThunderbirds = new Hockey_Team("The Thunderbirds");
		
		Team minorLeague = new Baseball_Team();
		
		//List<String> players = new ArrayList<>();
		List<String> players = Arrays.asList("Griffey", "The Big Unit", "Buhner");
		
		
		theMariners.setPlayers(Arrays.asList(players));
		
		System.out.println(theMariners.toString());
	}
}