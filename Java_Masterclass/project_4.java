//project 4 from Java Masterclass. Char and boolean primatives
//unicode-table.com

public class project_4{
		public static void main(String[] args){
			char myChar = 'f';
			char unicodeChar = '\u0040'; //ouputs a unicode character corresponding to value
			
			boolean myBoolean = false;
			boolean is_Male = true;
			
			System.out.println("Unicode character is: " + unicodeChar);
			
			/******************************** challenge ******************************/
			/* 1. Find the code for the registered symbol on the same line as the copyright symbol.
			   2. Create a variable of type char and assign it the unicode value for that symbol.
			   3. Display it on the screen. */
			   
			char myUnicode = '\u00AE';
			System.out.println("myUnicode symbol: " +  myUnicode);
		
		}
}