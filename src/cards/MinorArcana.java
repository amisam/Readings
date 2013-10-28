package cards;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MinorArcana extends Card{

	private RANK rank;

	public MinorArcana(RANK rank, SUIT suit) {
		super(suit);
		this.rank = rank;
		loadMeaning();
	}

	public MinorArcana(int rank, SUIT suit) {
		super (suit);
		this.rank = RANK.values()[rank];
		loadMeaning();
	}

	private void loadMeaning(){
		if (rank == null) return;
		try{
			File open = new File(cardMeaningFolder+suit+"_"+rank+".txt");
			Scanner sc = new Scanner(open);
			meaning = sc.nextLine();
		} catch (IOException ioe) {
			System.out.println("file "+suit+"_"+rank+".txt not found: ");
			//ioe.printStackTrace();
		}
	}

	@Override
	public String name() {
		return rank+" of "+suit;
	}

	@Override
	public String meaning() {
		return meaning;
	}

	@Override
	public int rank() {
		// the minor arcana
		if (suit.ordinal() > 21)
			return rank.ordinal();
		else	// the major arcana
			return -1;	//fail

	}

	@Override
	public SUIT suit() {
		return suit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
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
		MinorArcana other = (MinorArcana) obj;
		if (rank != other.rank)
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}


}
