import java.io.*;
import java.lang.*;
import java.util.*;

class cards {
	public static void main(String[] args){
		String[] values = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] suits = {"H","D","S","C"};
		String[] deck = new String[52];
		int count = 0;
		int pick = 0;

		for(int i = 0; i < suits.length; i++){
			for(int j = 0; j < values.length; j++){
				deck[count] = ((values[j] + suits[i] + " "));
				count ++;
			}
		}
		
		/*for(int i = 0; i < deck.length; i++){
			System.out.print(deck[i] + " ");
		}*/

		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Deck of cards simulator.\n");
		System.out.println("There are " + count + " cards left in the deck.");
		System.out.print("What would you like to do: \n");
		int choice = keyboard.nextInt();

		if(choice == 1){
			pick = rand.nextInt(52);
			System.out.print("You drew a: " + deck[pick] + "\n");
			count -= 1;
			System.out.print("There are now " + count + " cards left in the deck\n");
		}else{
			System.out.print("Goodbye");	
		}
	}
}
