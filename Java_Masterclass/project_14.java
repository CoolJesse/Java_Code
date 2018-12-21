/* project_14 from Java Master Class; Expressions, Statements, Code Blocks, Methods, and more:
Method Overloading Recap */

public class project_14{
	
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value!"; //final == const
	
	public static void main(String[] args){
		
		System.out.println("Testing getDurationString(int, int)");
		System.out.println( getDurationString(5, 30) );
		System.out.println( getDurationString(-1, 45) );
		System.out.println( getDurationString(45, -1) );
		System.out.println( getDurationString(125, 10) );
		System.out.println( getDurationString(120, 0) ); 

		System.out.println("Testing getDurationString(int)");		
		System.out.println( getDurationString(75) );
		System.out.println( getDurationString(-1) );
		System.out.println( getDurationString(120) );
		System.out.println( getDurationString(5000) );
			
	}
	public static String getDurationString(int minutes, int seconds){
		if(minutes < 0 || seconds < 0 || seconds > 59){
			//System.out.println("Invalid value.");
			return INVALID_VALUE_MESSAGE;
		}
		
		else{
			int hours = (minutes/60);
			minutes %= 60;
			return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
		}
		
	}
	
	public static String getDurationString(int seconds){
		if(seconds < 0)
			return INVALID_VALUE_MESSAGE;
		
		else{
			int minutes = seconds/60;
			seconds %= 60;
			
			return getDurationString(minutes, seconds);
		}
	}
}