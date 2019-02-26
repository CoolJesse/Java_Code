public class Album{
/** Fields ***********************************************************************************/
	private String artist;
	private String album;
	private List songs;
/*********************************************************************************************/
/** Constructor ******************************************************************************/
	public Album(String artist, String album, LinkedList<String> songs){
		this.album = album;
		this.artist = artist;
		this.songs = songs;
	}
/*********************************************************************************************/
/** Getters **********************************************************************************/
	public String getAlbum(){
		return album;
	}
	public String getArtist(){
		return artist;
	}
	public List getSongs(){
		return songs;
	}
/*********************************************************************************************/
/** Methods **********************************************************************************/
	public void addSong(String song){
		if(!songs.contains(song))
			songs.add(song);
	}
	public void removeSong(String song){
		songs.remove(song);
	}
/*********************************************************************************************/
}