import java.io.*;
import java.lang.*;
import java.util.*;

class cards {
	public static void main(String[] args){
		String[] values = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] suits = {"H","D","S","C"};
		String[] deck = new String[52];
		String[] hand = {"-","-","-","-","-"};
		int count = 0;
		int pick = 0;
		int again = 0;
		int handCards = 0;

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
		System.out.println("There are " + count + " cards in the deck.");

		do{
		System.out.print("\nWhat would you like to do: \n");
		System.out.print("1.) Draw card\n2.) Discard\n3.) Check hand\n4.) Exit simulator\n");
		System.out.print("Please enter a number: ");
		int choice = keyboard.nextInt();

		if(choice == 1){
			pick = rand.nextInt(52);
			System.out.print("\nYou drew a: " + deck[pick] + "\n");
			
			if(handCards < 5){
				hand[handCards] = deck[pick];
				handCards ++;
				count -= 1;
			}else{
				System.out.println("Hand is currently full! Need to discard before drawing again.\n");
			}
			
		}else if(choice ==2){

			if(handCards > 0) {
				System.out.print("Which card would you like to discard (1,2,3,4,5): ");
				int temp = keyboard.nextInt();
				hand[temp] = "-";
				handCards -= 1;
				count += 1;
			}else{
				System.out.print("\nYou have no cards in your hand! Need to draw before you can discard.\n");
			}

		}else if(choice == 3){
			System.out.print("Your current hand: ");
			for(int i = 0; i < 5; i++){
				System.out.print(hand[i] + " ");
			}
		}else{
			again = 1;
			System.out.print("Goodbye\n\n");	
		}
		
		System.out.print("\nThere are now " + count + " cards left in the deck\n");
		
		}while(again == 0);
	}
}
