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
		Album album_1 = new Album("The Smiths", "The Queen is Dead");
		Album album_2 = new Album("The Smiths", "The Queen is Dead");
		System.out.println("album 1 is the same as album 2: " + album_1.equals(album_2));
		*/
		/*
		Iterator itr = albums.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		*/
		createPlaylist(albums, playlist);
		menu(playlist);
		
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
		
			while(fileScanner.hasNextLine()){
				String artist = fileScanner.nextLine();
				String album = fileScanner.nextLine();
				
				LinkedList<Song> songs = new LinkedList<Song>();
				
				while(!fileScanner.hasNext(p)){
					String song = fileScanner.nextLine();
					String duration = fileScanner.nextLine();

					songs.add(new Song(song, duration));					
					
				}
				albums.add(new Album(artist, album, songs));	
			/** Skip '@' symbol **/
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
	public static void createPlaylist(ArrayList<Album> albums, LinkedList<Song> playlist){
		boolean done = false;
		
		System.out.println("Albums: ");
		for(int i=0; i < albums.size(); i++){
			/*System.out.println(albums.get(i).getArtist() + " " + albums.get(i).getAlbum());*/
			System.out.println(albums.get(i).info());
			System.out.println("");
		}		

		while(!done){
			
			System.out.print("To see list of albums and songs enter L. Would you like to add a song to the playlist Y/N-> ");
			char answer = scanner.next().charAt(0);
			scanner.nextLine();
			
			answer = Character.toLowerCase(answer);
			
			if(answer == 'y'){
				System.out.print("Artist-> ");
				String artist = scanner.nextLine();
				
				System.out.print("Album-> ");
				String album = scanner.nextLine();
				
				System.out.print("Song Title-> ");
				String songTitle = scanner.nextLine();
				
				int index = albums.indexOf(new Album(artist, album));

				if(index != -1){
					//System.out.println("Postion of " + artist + " " + album + " is " + index);	
					Iterator<Song> itr = albums.get(index).getSongs().iterator();
					boolean found = false;
					while(itr.hasNext()){
						Song temp = itr.next();
						if(temp.getTitle().equals(songTitle)){
							//System.out.println("Added to playlist
							playlist.add(new Song(temp));
							found = true;
							break;
						}
					}
					if(found == false){
						System.out.println("Sorry, could not find that song");
					}	
				}
				else
					System.out.println("Sorry, could not find that artist or album.");
			}
			else if(answer == 'n'){
				done = true;
			}
			else if(answer == 'l'){
				System.out.println("Albums: ");
				for(int i=0; i < albums.size(); i++){
					System.out.println(albums.get(i).info());
				}	
				System.out.println("");
			}
			else{
				System.out.println("Sorry, invalid input");
			}
				
		}
	}
/** Method to control listening experience *************************************************/
	public static void menu(LinkedList<Song> playlist){
		System.out.println("---------- Menu ----------");
		System.out.println("| Quit: 1                |");
		System.out.println("| Skip Forward: 2        |");
		System.out.println("| Skip Backward: 3       |");
		System.out.println("| Replay Current Song: 4 |");
		System.out.println("| Display Playlist: 5    |");
		System.out.println("| Display Menu: 6        |");
		System.out.println("--------------------------");
		
		ListIterator<Song> itr = playlist.listIterator();
		
		while(itr.hasNext()){
			Song currentSong = itr.next();
			System.out.println("current track: " + currentSong.getTitle() + " " +currentSong.getDuration() );
				
			System.out.print("-> ");
			int command = scanner.nextInt();
			scanner.nextLine();
				
			switch(command){
			/** Quit **/
				case 1:
					return;
			/** Skip to next track **/
				case 2:	
					if(!itr.hasNext())
						System.out.println("End of playlist");
					break;
			/** Skip back to previous song **/
				case 3:
					if(itr.hasPrevious())
						currentSong = itr.previous();
					if(itr.hasPrevious())
						currentSong = itr.previous();			
					break;
			/** Repeat song **/
				case 4:
					if(itr.hasPrevious())
						currentSong = itr.previous();
					break;
			/** Display playlist **/
				case 5:
					Iterator<Song> itr_2 = playlist.iterator();
					while(itr_2.hasNext()){
						Song temp = itr_2.next();
						System.out.println(temp.getTitle() + " " + temp.getDuration());
						}
					break;
			/** Show menu **/
				default:
					System.out.println("---------- Menu ----------");
					System.out.println("| Quit: 1                |");
					System.out.println("| Skip Forward: 2        |");
					System.out.println("| Skip Backward: 3       |");
					System.out.println("| Replay Current Song: 4 |");
					System.out.println("| Display Playlist: 5    |");
					System.out.println("| Display Menu: 6        |");
					System.out.println("--------------------------");	
					break;
			}
		}
	}
}