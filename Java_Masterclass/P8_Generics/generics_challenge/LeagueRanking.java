import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LeagueRanking<T extends Team>{
/***************************************** FIELDS *********************************************/
	private List<T> rankings;
/**********************************************************************************************/
/*************************************** CONSTRUCTOR ******************************************/
	public LeagueRanking(){
		rankings = new ArrayList<T>();
	}
/**************************************** SETTERS *********************************************/
	public void setRanking(List<T> rankings){
		if(!this.rankings.isEmpty())
			this.rankings.clear();
		
		this.rankings.addAll(rankings);
	}
/**************************************** GETTERS *********************************************/
	public List<T> getRanking(){
		return rankings;
	}
/**************************************** METHODS *********************************************/
	public void addTeam(T team){
		if(!rankings.contains(team)){
			rankings.add(team);
			Collections.sort(rankings);
		}
	}
	@Override
	public String toString(){
		return rankings.toString();
	}
	//@SafeVarargs
	/*
	public void setTeam(T... team){
		for(T t: team){
		 this.rankings.add(t);
		}		
	}
	*/	
}