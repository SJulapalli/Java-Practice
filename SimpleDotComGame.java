import java.lang.Math;
import java.lang.Object;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SimpleDotComGame {

	int hitlocation = 0;
	int hits = 0;

	int misses = 0;
	int location1hits = 0;
	int location2hits = 0;
	int location3hits = 0;
	
		
	public static String getUserInput(String prompt) {
			String inputLine = null;
			System.out.print(prompt + " ");
			try {
				BufferedReader is = new BufferedReader(
				new InputStreamReader(System.in));
				inputLine = is.readLine();
				if (inputLine.length() == 0) return null;
			} catch (IOException e) {
				System.out.println("IOException: " + e);
			}
			return inputLine;
	}

	   
	public static void main(String[] args) {

		int hits = 0;
		int misses = 0;
		int location1 = (int) (Math.random() * 5);
		int location2 = location1 + 1;
		int location3 = location2 + 1;
		
		int location1hits = location1;
		int location2hits = location2;
		int location3hits = location3;

		System.out.println("Ship is in locations.. " + location1 + " " + location2 + " " + location3);

		while (hits < 3) {

			String userinput = SimpleDotComGame.getUserInput("Please enter a number :");
			int userguess =	Integer.parseInt(userinput);

			if(userguess == location1) {
				
				if(location1hits > location1) {
					System.out.println("Location Already Hit");
				}
				else {
					System.out.println("Hit");
					hits++;
					location1hits++;
				}
			}
			else if(userguess == location2) {
				if(location2hits > location2) {
					System.out.println("Location Already Hit");
				}
				else {
					System.out.println("Hit");
					hits++;
					location2hits++;
				}
			}
			else if(userguess == location3) {
				
				if(location3hits > location3) {
					System.out.println("Location Already Hit");
				}
				else {
					System.out.println("Hit");
					hits++;
					location3hits++;
				}
			}
			else {
				System.out.println("Miss");
				misses++;
			}
	
			System.out.println ("Hits so far: " + hits);

			if(hits == 3) {
				System.out.println("DotCom Destroyed. Game Over.");
			}
		}
	}
}
