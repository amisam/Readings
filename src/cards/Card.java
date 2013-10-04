package cards;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public abstract class Card {

	protected RANK rank;
	protected SUIT suit;
	protected String meaning;

	protected String cardMeaningFolder = "cardMeanings/";

	public Card(RANK rank, SUIT suit) {
		this.rank = rank;
		this.suit = suit;
		try{
			File open = new File(cardMeaningFolder+suit+"_"+rank+".txt");
			Scanner sc = new Scanner(open);
			meaning = sc.nextLine();
		} catch (IOException ioe) {
			System.out.println("file "+suit+"_"+rank+".txt not found: ");	ioe.printStackTrace();
		}
	}

	public abstract String name();
	public abstract String meaning();
	public abstract int rank();
	public abstract SUIT suit();


}
