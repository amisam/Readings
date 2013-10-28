package cards;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MajorArcana extends Card{

	private int rank;

	public MajorArcana(SUIT suit) {
		super(suit);
		loadMeaning();
	}

	private void loadMeaning(){
		if (suit == null)	return;

		try{
			File open = new File(cardMeaningFolder+suit.ordinal()+"_"+suit+".txt");
			Scanner sc = new Scanner(open);
			meaning = sc.nextLine();
		} catch (IOException ioe) {
			System.out.println("file "+suit.ordinal()+"_"+suit+".txt not found: ");
			//ioe.printStackTrace();
		}
	}

	@Override
	public String name() {
		String[] fix = suit.toString().split("_");
		String name = fix[0].substring(0,1).toUpperCase() + fix[0].substring(1).toLowerCase();
		for(int i = 1; i < fix.length; ++i)
			name += " " + fix[i].substring(0,1).toUpperCase() + fix[i].substring(1).toLowerCase();;
		return name;
	}

	@Override
	public String meaning() {
		return meaning;
	}

	@Override
	public int rank() {
		// the major arcana
		if (suit.ordinal() < 22)
			return suit.ordinal();
		else	// the minor arcana
			return -1;	// fail
	}

	@Override
	public SUIT suit() {
		// the cards name
		return suit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rank;
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MajorArcana other = (MajorArcana) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}



}
