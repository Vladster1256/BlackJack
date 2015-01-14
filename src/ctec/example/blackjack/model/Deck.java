package ctec.example.blackjack.model;

import java.lang.reflect.Array;

public class Deck
{
	private Card[] Deck;
	
	public Deck()
	{
		Deck = new Card[52];
	}
	
	public void createDeck()
	{
		int position = 0;
		
		for (int suit = 1; suit <= 4; suit ++)
		{
			for(int value = 1; value <13; value ++)
			{
				Deck[position] =  new Card(suit, value);
				position++;
			}
		}
	}
}
