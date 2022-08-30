package timeCalculator;

/*Create a time calculator for adding times together. A playlist has multiple songs with varying lengths, 
collect input for # of songs, length of each song, and display total length of the playlist.
*/

/*Steps:
 * Ask 1st song length, minutes then seconds
 * Ask 2nd song length, minutes then seconds
 * Convert song1 and song2 to seconds
 * Sum songs total
 * Ask if add another song, 
 * 		do while yes ask next song length, minutes then seconds
 * 		Convert next song to seconds
 * 		Sum next with total
 * Convert seconds to hours,minutes,seconds
 * Display "The playlist is " + h + " hours " + minutes + " minutes " + seconds + " long." 
 */
import java.util.Scanner;

public class TimeCalc {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to my Song Playlist Calculator!");
		System.out.println("With this program you are able to add 2 or more songs together to get the total time of a playlist.");

		System.out.println("What is the length of the first song's minutes?");
		int song1Min = input.nextInt();
		System.out.println("What is the length of the first song's seconds?");
		int song1Sec = input.nextInt();
		int song1Sum = (song1Min * 60) + song1Sec;
		
		int songTotal = song1Sum;
				
		do {
			System.out.println("What is the length of the next song's minutes?");
			int minutesNext = input.nextInt();
			System.out.println("What is the length of the next song's seconds?");
			int secondsNext = input.nextInt();
			int songNextSum = (minutesNext * 60) + secondsNext;
			songTotal = songTotal + songNextSum;
			System.out.println("Would you like to add another song? (yes/no)");
			String another = input.next();
			if(another.equals("no")) {
				break;
			}
		} while (true);
		
		int playlistTotalHrs = (songTotal / 60) / 60;
		int playlistTotalMin = (songTotal / 60) % 60;
		int playlistTotalSec = songTotal % 60;
		
		System.out.println("Your playlist is " + playlistTotalHrs + " hours and " + playlistTotalMin + " minutes and " + playlistTotalSec + " seconds long.");
	} 
}
