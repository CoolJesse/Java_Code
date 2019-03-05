/* Linked List Challenge from Java Master Class; Arrays, Java inbuilt Lists, AutoBoxing, and Unboxing: Arrays */

/** Challenge ***************************************************************************
1. Create a program that implements a playlist for songs.
2. Create a Song class having Title and Duration for a song.
3. Create a Album class containing a list of songs.
	a. Albums will be stored in an ArrayList.
4. Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
5. Once the songs have been added to the playlist, create a menu of options to:
	a. quit
	b. skip forward to next song
	c. skip backwards to a previous song
	d. replay the current song
	e. list the songs in the playlist
6. A song must exist in an album before it can be added to the playlist.
7. Provide an option to remove the current song from the playlist "listiterator.remove()."
*****************************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.util.regex.Pattern;

public class main{
	private static String filePath = "C:\\Users\\jessetolson\\Documents\\computer_stuff\\Learning_Java\\Java_Masterclass\\P6_Arrays_Lists_Autoboxing_Unboxing\\LinkedList_challenge\\Albums_Artists_Songs.txt";
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){

		ArrayList<Album> albums = new ArrayList<Album>();
		LinkedList<Song> playlist = new LinkedList<Song>();

		createAlbumList(albums);
		
		/*
		Iterator itr = albums.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		*/
		//createPlaylist(albums);
		//menu();
		
	}
/** Method to create list of albums ********************************************************/
	public static void createAlbumList(ArrayList<Album> albums){
		
		File file = new File(filePath);
		//file.setReadable(true);
		//System.out.println("File exists: " + file.exists());
		//System.out.println("Can read file " + file.canRead());
		//System.out.println("Absolute path: " + file.getAbsolutePath());
		
		try{
			Scanner fileScanner = new Scanner(file);
			Pattern p = Pattern.compile("@");
			System.out.println("Pattern: " + p);
		
			while(fileScanner.hasNextLine()){
				String artist = fileScanner.nextLine();
				System.out.println(artist);
				String album = fileScanner.nextLine();
				System.out.println(album);
				
				
				LinkedList<Song> songs = new LinkedList<Song>();
				
				while(!fileScanner.hasNext(p)){
					String song = fileScanner.nextLine();
					String duration = fileScanner.nextLine();
					System.out.println("Song: " + song);
					System.out.println(duration);
					songs.add(new Song(song, duration));					
					
				}
				albums.add(new Album(artist, album, songs));	
			/** Skip '$' symbol **/
				fileScanner.nextLine();				
			}
			fileScanner.close();			
		}
		catch(FileNotFoundException e){
			System.out.println(e + " Unable to read from file.");
		}
	}
/*******************************************************************************************/
/** Method to create playlist **************************************************************/
	public static void createPlaylist(ArrayList<Album> albums){
		boolean done = false;
		
		System.out.println("Albums: ");
		for(int i=0; i < albums.size(); i++){
			System.out.println(albums.get(i).getArtist() + " " + albums.get(i).getAlbum());
		}		

		while(!done){
			
			System.out.println("Enter L to see list of Songs. Add song to playlist? Y/N.");
			char answer = scanner.next().charAt(0);
			scanner.nextLine();
			
			answer = Character.toLowerCase(answer);
			
			if(answer == 'y'){
				System.out.println("Adding to playlist");
			}
			else if(answer == 'n'){
				done = true;
			}
			else if(answer == 'l'){
				System.out.println("Albums: ");
				for(int i=0; i < albums.size(); i++){
					System.out.println(albums.get(i).getArtist() + " " + albums.get(i).getAlbum());
				}				
			}
			else{
				System.out.println("Sorry, invalid answer");
			}
				
		}
	}
/** Method to control listening experience *************************************************/
	public static void menu(){
		System.out.println("---------- Menu ----------");
		System.out.println("| Quit: 1                |");
		System.out.println("| Skip Forward: 2        |");
		System.out.println("| Skip Backward: 3       |");
		System.out.println("| Replay Current Song: 4 |");
		System.out.println("| Display Playlist: 5    |");
		System.out.println("--------------------------");
	}
}