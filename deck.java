import java.util.*
import java.io.*

public class deck {
	public deck{
		String[] values = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] suits = {"H","D","S","C"};
		int count = 0;
		int pick = 0;
		int again = 0;
		int handCards = 0;                          
		int size = 52;

		List<String> deck = new ArrayList<>();
		List<String> hand = new ArrayList<>();
		hand.add("-");
		hand.add("-");
		hand.add("-");
		hand.add("-");
		hand.add("-");

		for(int i = 0; i < suits.length; i++){
			for(int j = 0; j < values.length; j++){
				deck.add((values[j] + suits[i] + " "));
				count ++;
			}
		}

		public String draw() {
			Random rand = new Random();
			Scanner keyboard = new Scanner(System.in);

			if(size > 0){
				pick = rand.nextInt(size);
				temp = deck.get(pick);
				deck.remove(pick);
				size -= 1;
				return temp;
			}
		}

		

	}
}
