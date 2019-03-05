public class Song{

/** Fields ************************************************************************************/
	private String title;
	private String duration;
/**********************************************************************************************/
/** Constructor *******************************************************************************/
	public Song(String title, String duration){
		this.title = title;
		this.duration = duration;
	}
/**********************************************************************************************/
/** Getters ***********************************************************************************/
	public String getTitle(){
		return title;
	}
	public String getDuration(){
		return duration;
	}
/**********************************************************************************************/
/** Methods ***********************************************************************************/
	//@Override
	public boolean equals(Song song){
		
		if( this == song)
			return true;
		
		if(!(song instanceof Song))
			return false;
		
		Song temp = (Song) song;
		
		return (title.equals(temp.title) && duration.equals(temp.duration));
	}
	@Override
	public String toString(){
		return title + " " + duration;
	}
/**********************************************************************************************/
}