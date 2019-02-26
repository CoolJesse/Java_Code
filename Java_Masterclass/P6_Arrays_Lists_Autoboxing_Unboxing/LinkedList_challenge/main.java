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
import java.util.scanner;

public class main{
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		
		List<Albums> albums = new ArrayList<>(Albums);
		List<Song> playlist = new LinkedList<Song>();

		
		createPlaylist();
		menu();
		
	}
/** Method to create list of albums ********************************************************/
	public void createAlbumList(List<Album> albums){
		private static File file = new File("C:\Users\jessetolson\Documents\computer_stuff\Learning_Java\Java_Masterclass\P6_Arrays_Lists_Autoboxing_Unboxing\LinkedList_challenge\Albums_Artists_Songs");
		
		Scanner fileScanner = new Scanner(file);
		
		while(fileScanner.hasNextLine()){
			String artist = fileScanner.next();
			String album = fileScanner.next();
			
			List<Song> songs = new LinkedList<songs>();
			
			while(!hasNext("$")){
			String song = fileScanner.next();
			double duration = fileScanner.nextDouble();
			
			songs.(new(song, duration));
			}
			
			albums.add(new(artist, album, songs));
			
		}
		fileScanner.close();
	}
/*******************************************************************************************/
/** Method to create playlist **************************************************************/
	public static void createPlaylist(){
		boolean done = false;
		while(!done){
			System.out.println("Albums: ");
			for(int i=0; i < albums.size(); i++){
				System.out.println(albums.get(i).getArtist() + " " + albums.get(i).getAlbum());
			}
			
			System.out.println("Add song to playlist? Y/N.");
			char answer = scanner.nextChar();
			scanner.nextLine();
			
			if(answer == 'Y'){
				
			}
			else 
				done = true;
				
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