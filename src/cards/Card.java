package cards;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public abstract class Card {

	protected SUIT suit;
	protected String meaning;

	protected String cardMeaningFolder = "cardMeanings/";

	public Card(SUIT suit) {
		this.suit = suit;
	}

	public abstract String name();
	public abstract String meaning();
	public abstract int rank();
	public abstract SUIT suit();


}
