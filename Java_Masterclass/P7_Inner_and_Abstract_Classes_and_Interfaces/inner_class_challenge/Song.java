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
	public Song(Song newSong){
		this.title = newSong.getTitle();
		this.duration = newSong.getDuration();
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
	@Override
	public boolean equals(Object obj){
		
		if(obj != null && getClass() == obj.getClass()){
			if(this == obj)
				return true;
			
			Song temp = (Song)obj;
			
			return (title.equals(temp.title) && duration.equals(temp.duration));
		}
		else
			return false;
	}
	@Override
	public String toString(){
		return title + " " + duration;
	}
/**********************************************************************************************/
}