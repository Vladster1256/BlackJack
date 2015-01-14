package ctec.example.blackjack.model;

import android.media.Image;

public class Card
{
	public int suit;
	public int value;
	
	public Card(int suit, int value)
	{
		this.suit = suit;
		this.value = value;
	}
	
	
	public int getSuit()
	{
		return suit;
	}
	
	public int getValue()
	{
		return value;
	}
}
