import java.util.*;

public class Album{
/** Inner Class ******************************************************************************/
	private class Songlist{
	/** Fields *************************************************************************/
		private List<Song> songs;
	/** Constructor ********************************************************************/
		private Songlist(){
			songs = new ArrayList<Song>();
		}
		private Songlist(List<Song> songsToAdd){
			this();
			songs.addAll(songsToAdd);
		}
	/** Getter *************************************************************************/
		private List<Song> getSongs(){
			return songs;
		}
	/** Methods ************************************************************************/	
		private int findSong(String title, String duration){
			return songs.indexOf(new Song(title, duration));
		} 
		private void addSong(Song song){
			if(findSong(song.getTitle(), song.getDuration()) == -1)
				songs.add(song);
		}
		private void remove(String song){
			for(int i=0; i<songs.size(); i++){
				if(songs.get(i).getTitle() == song)
					songs.remove(i);
				break;
			}
		}
	}
/** End of inner class ***********************************************************************/
/*********************************************************************************************/
/** Fields ***********************************************************************************/
	private String artist;
	private String album;
	//private List<Song> songs = new LinkedList<Song>();
	private Songlist songlist;
/*********************************************************************************************/
/** Constructor ******************************************************************************/
	public Album(String artist, String album, List<Song> songs){
		this.artist = artist;
		this.album = album;
		
		this.songlist = new Songlist(songs);
	}
	public Album(String artist, String album){
		this.artist = artist;
		this.album = album;
		
		this.songlist = new Songlist();
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
		return songlist.getSongs();
	}
/*********************************************************************************************/
/** Methods **********************************************************************************/
	public void addSong(Song song){
		songlist.addSong(song);
	}
	public void addSong(String title, String time){
		Song newSong = new Song(title, time);
		songlist.addSong(newSong);		
	}
	public void removeSong(String song){
		songlist.remove(song);
	}
	@Override
	public String toString(){
		return( "Artist: " + artist + '\n' + "Album: " + album  + '\n' + "tracks: " + songlist.songs.toString() );
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