import java.util.*;
public class Exec {
	final static int NumberOfPacks = 1;
	final static int CardsInPack = 52;
	static int allCards = NumberOfPacks*CardsInPack;
	//static int[] Cards = new int[allCards];
	static ArrayList<Integer> Cards = new ArrayList<Integer>();
	static int chosennum;
	
	public static void main(String[] args) {
		for (int i =0; i < (allCards-1); i++)
		{
			Cards.add(i);
			//System.out.println(Cards.get(i));
		}
		//System.out.println(Cards.size());
		for (int i = 0; i < allCards-1; i++) {
			getCard();
			System.out.println(chosennum);
		}
		
	}
	public static void getCard ()
	{
			int random;
			Random rnd = new Random();
			random = rnd.nextInt(Cards.size());
			chosennum = Cards.get(random);
			Cards.remove(random); 
	}

}
