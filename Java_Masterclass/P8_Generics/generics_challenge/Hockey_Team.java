public class Hockey_Team extends Team{
/** Constructors *****************************************************************************/
	public Hockey_Team(String name){
		super(name, "Hockey");
	}
	public Hockey_Team(String name, int rank){
		super(name, "Hockey", rank);
	}	
	public Hockey_Team(){
		super("", "Hockey");
	}
/*********************************************************************************************/	
}