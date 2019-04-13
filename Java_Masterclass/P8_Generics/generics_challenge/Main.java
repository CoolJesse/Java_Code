import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;

public class Main{
	public static void main(String[] args){
	// Create leader boards for each sport //
		LeagueRanking<Baseball_Team> baseballRankings = new LeagueRanking<>();
		LeagueRanking<Basketball_Team> basketballRankings = new LeagueRanking<>();
		LeagueRanking<Football_Team> footballRankings = new LeagueRanking<>();
		LeagueRanking<Hockey_Team> hockeyRankings = new LeagueRanking<>();
		
	// Create baseball teams //
		Baseball_Team theMariners = new Baseball_Team("The Mariners", 5);
		Baseball_Team theYankees = new Baseball_Team("The Yankees", 1);
		Baseball_Team theCardinals = new Baseball_Team("The Cardinals", 2);
		Baseball_Team theDodgers = new Baseball_Team("The Dodgers", 3);
		Baseball_Team theCubs = new Baseball_Team("The Cubs", 4);
		
	// Add players to baseball teams //
		String[] a = new String[]{"Griffey", "The Big Unit", "Buhner"};
		List<String> players = new ArrayList<String>(Arrays.asList(a));
		theMariners.setPlayers(players);
		
		// More intuitive way to add players //
		theYankees.setPlayers("Joe DiMaggio", "Mickey Mantle", "Yogie Berra");		
		theCardinals.setPlayers("Some guy", "Some Other Guy", "Terry");		
		theDodgers.setPlayers("Tommy Lasorta", "Tom Cruise", "Steve");
		theCubs.setPlayers("John", "Paul", "Jones");
		
	// Add each baseball team to the leader board //
		baseballRankings.addTeam(theMariners);
		baseballRankings.addTeam(theYankees);
		baseballRankings.addTeam(theCardinals);
		baseballRankings.addTeam(theDodgers);
		baseballRankings.addTeam(theCubs);
		
	// Create list of basketball team to add to basketball leader board
		List<Basketball_Team> basketBallTeams = new LinkedList<>();
	// Add basketball teams to list of basketball teams
		basketBallTeams.add(new Basketball_Team("The Super Sonics", 1));
		basketBallTeams.add(new Basketball_Team("The Chicago Bulls", 3));
		basketBallTeams.add(new Basketball_Team("The Golden State Warriors", 2));
		basketBallTeams.add(new Basketball_Team("The Utah Jazz", 7));
		basketBallTeams.add(new Basketball_Team("The New York Knicks", 3));
	// Add basketball teams in list to leader board	
		Iterator itr = basketBallTeams.iterator();
		while(itr.hasNext()){
			basketballRankings.addTeam((Basketball_Team)itr.next());
		}
 
	// Create list of football teams
		List<Football_Team> FB_Teams = new LinkedList<>();
	// Add teams to list of football teams
		FB_Teams.add(new Football_Team("The Seahawks", 1));
		FB_Teams.add(new Football_Team("The Cowboys", 10));
		FB_Teams.add(new Football_Team("The 49ers", 2));
		FB_Teams.add(new Football_Team("The Oakland Raiders", 11));
		FB_Teams.add(new Football_Team("The Patriots", 12));
		FB_Teams.add(new Football_Team("The New York Giants", 3));
		
	// Add basketball teams in list to leader board	
		itr = FB_Teams.iterator();
		while(itr.hasNext()){
			footballRankings.addTeam((Football_Team)itr.next());
		}
		
	// Create list of hockey teams
		List<Hockey_Team> H_Teams = new LinkedList<>();
	// Add teams to list of hockey teams
		H_Teams.add(new Hockey_Team("The Thunderbirds", 3));
		H_Teams.add(new Hockey_Team("The Rangers", 1));
		H_Teams.add(new Hockey_Team("The Kings", 4));
		H_Teams.add(new Hockey_Team("The Maple Leafs", 5));
		H_Teams.add(new Hockey_Team("The Redwings", 11));
		H_Teams.add(new Hockey_Team("The Canadians", 2));
		
	// Add hockey teams in list to leader board
		itr = H_Teams.iterator();
		while(itr.hasNext()){
			hockeyRankings.addTeam((Hockey_Team)itr.next());
		}
	
	// Print leader board results 
		System.out.println("Baseball rankings: " + baseballRankings.toString());
		System.out.println("Basketball rankings:" + basketballRankings.toString());	
		System.out.println("Football rankings: " + footballRankings.toString());		
		System.out.println("Hockey rankings: " + hockeyRankings.toString());
		
	}
}