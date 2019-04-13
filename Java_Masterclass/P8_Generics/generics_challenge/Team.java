import java.util.List;
import java.util.ArrayList;

public abstract class Team implements Comparable<Team>{
/************************************** Fields ***********************************************/
	protected String name;
	protected String sport;
	protected int rank;
	
	protected List<String> players = new ArrayList<>();
/*********************************************************************************************/
/*********************************** Constructors ********************************************/
	public Team(String name, String sport, int rank){
		this.name = name;
		this.sport = sport;
		this.rank = rank;
	}
	public Team(String name, String sport){
		this(name, sport, 0);
	}
/*********************************************************************************************/
/**************************************** GETTERS ********************************************/
	public String getName(){
		return name;
	}
	public String getSport(){
		return sport;
	}
	public int getRank(){
		return rank;
	}
	public List getPlayers(){
		return players;
	}
/***************************************** SETTERS *******************************************/
public void setName(String name){
		this.name = name;
	}
	public void setRank(int rank){
		this.rank = rank;
	}
	public void setPlayers(List<String> players){
		if(!this.players.isEmpty())
			this.players.clear();
		
		this.players.addAll(players);
	}
// Allows to pass a variable number of arguments to the method
	public void setPlayers(String... players){
		if(!this.players.isEmpty())
			this.players.clear();
		
		for(String p : players){
			this.players.add(p);
		}
	}
/****************************************** METHODS ******************************************/
	public void addPlayer(String name){
	// Test if player is already on team
		if(!players.contains(name))
			players.add(name);
	}
	public boolean tradePlayers(Team otherTeam, String coming, String going){
	// Test to make sure both teams are of the same type
		if(this.getClass() == otherTeam.getClass()){
		// Look for position of player to be traded away, return false if not found
			int goingIndex = players.indexOf(going);
			if(goingIndex != -1){
				players.remove(goingIndex);
			// Check if player be traded for is already on team
				if(!players.contains(coming)){
					players.add(coming);
				}
			// Invoke trading function for other team
				tradePlayers(this, going, coming);
				
				return true;
			}
		// if player to be traded away in no on this team return false
			else 
				return false;
		}
	// If the two teams do not play the same sport
		else
			return false;
	}
	@Override
	public boolean equals(Object obj){
		if(obj != null && this.getClass() == obj.getClass()){
			Team temp = (Team)obj;
			return (this.getName()==temp.getName());
		}
		else 
			return false;
	}
	@Override
	//public int compareTo(Object obj){
	public int compareTo(Team obj){
		Team temp = (Team)obj;
		
		Integer thisInt = this.getRank();
		Integer otherInt = temp.getRank();
		
		return thisInt.compareTo(otherInt);
		//return ( this.getRank()).compareTo(temp.getRank()) );
	}
	@Override
	public String toString(){
		return (sport + " team: " + name + " ranked number " + rank);
	}
/*********************************************************************************************/
}