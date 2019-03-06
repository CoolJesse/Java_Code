import java.util.*;

public class Album{
/** Fields ***********************************************************************************/
	private String artist;
	private String album;
	private List<Song> songs = new LinkedList<Song>();
/*********************************************************************************************/
/** Constructor ******************************************************************************/
	public Album(String artist, String album, LinkedList<Song> songs){
		this.artist = artist;
		this.album = album;
		this.songs.addAll(songs);
	}
	public Album(String artist, String album){
		this.artist = artist;
		this.album = album;
	}
/*********************************************************************************************/
/** Getters **********************************************************************************/
	public String getAlbum(){
		return album;
	}
	public String getArtist(){
		return artist;
	}
	public List<Song> getSongs(){
		return songs;
	}
/*********************************************************************************************/
/** Methods **********************************************************************************/
	public void addSong(Song song){
		if(!songs.contains(song))
			songs.add(song);
	}
	public void addSong(String title, String time){
		Song newSong = new Song(title, time);
		if(!songs.contains(newSong))
			songs.add(newSong);		
	}
	public void removeSong(String song){
		songs.remove(song);
	}
	public String info(){
		String album_info = "Artist: " + artist + '\n' + "Album: " + album  + '\n' + "tracks: " + songs.toString();
		
		return album_info;
	}
	@Override
	public boolean equals(Object obj){
		
		if(obj != null && getClass() == obj.getClass()){
			if(this == obj)
				return true;
			
			Album temp = (Album)obj;
			
			return (artist.equals(temp.artist) && album.equals(temp.album));
		}
		else
			return false;
	}
/*********************************************************************************************/
}