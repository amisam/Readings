package cards;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MajorArcana extends Card{

	public MajorArcana(RANK rank, SUIT suit) {
		super(rank, suit);
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



}
