package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cards.Card;
import cards.CardFactory;
import cards.RANK;
import cards.MinorArcana;
import cards.SUIT;

/**<h2>Tests the creation of the cups suit</h2>
 * <p>
 * Confirms each card has the correct:<br />
 * <ul>
 * 	<li>The card retrieved from the factory matches one created.</li>
 * 	<li>The card has the correct suit and rank.</li>
 * 	<li>The card has the correct name.</li>
 * 	<li>The card has the right description.</li>
 * </ul>
 * </p>
 * @author hartesamu
 *
 */
public class CupsCardsTests {

	@Test
	public void aceCupsTest() {
		// creation
		Card aceCups = CardFactory.getCard(RANK.ace, SUIT.cups);
		// tests creation of right object
		assertEquals(aceCups, new MinorArcana(RANK.ace, SUIT.cups));
		// test rank
		assertEquals(aceCups.rank(), RANK.ace.ordinal());
		// test suit
		assertEquals(aceCups.suit(), SUIT.cups);
		// test correct name of each card
		assertEquals(aceCups.name(), "ace of cups");
		// test correct description of each card
		assertEquals(aceCups.meaning(), "Generally implies joy or peace, originating from close family.");
	}

	@Test
	public void twoCupsTest() {
		Card twoCups = CardFactory.getCard(RANK.two, SUIT.cups);
		assertEquals(twoCups, new MinorArcana(RANK.two, SUIT.cups));
		assertEquals(twoCups.rank(), RANK.two.ordinal());
		assertEquals(twoCups.suit(), SUIT.cups);
		assertEquals(twoCups.name(), "two of cups");
		assertEquals(twoCups.meaning(), "A complex card, this card can mean the power that is created when two come together.  It can signify a strong relationship between lovers, with a hint of danger and adventure.");
	}

	@Test
	public void threeCupsTest() {
		Card threeCups = CardFactory.getCard(RANK.three, SUIT.cups);
		assertEquals(threeCups, new MinorArcana(RANK.three, SUIT.cups));
		assertEquals(threeCups.rank(), RANK.three.ordinal());
		assertEquals(threeCups.suit(), SUIT.cups);
		assertEquals(threeCups.name(), "three of cups");
		assertEquals(threeCups.meaning(), "Symbolises simple joy and frivolity, often in conjunction with birth, and especially if combined with The Empress Major Arcana card.");
	}

	@Test
	public void fourCupsTest() {
		Card fourCups = CardFactory.getCard(RANK.four, SUIT.cups);
		assertEquals(fourCups, new MinorArcana(RANK.four, SUIT.cups));
		assertEquals(fourCups.rank(), RANK.four.ordinal());
		assertEquals(fourCups.suit(), SUIT.cups);
		assertEquals(fourCups.name(), "four of cups");
		assertEquals(fourCups.meaning(), "Can symbolise introspection or quiet deliberation, but also an obsession with minor tasks.");
	}

	@Test
	public void fiveCupsTest() {
		Card fiveCups = CardFactory.getCard(RANK.five, SUIT.cups);
		assertEquals(fiveCups, new MinorArcana(RANK.five, SUIT.cups));
		assertEquals(fiveCups.rank(), RANK.five.ordinal());
		assertEquals(fiveCups.suit(), SUIT.cups);
		assertEquals(fiveCups.name(), "five of cups");
		assertEquals(fiveCups.meaning(), "Often connotes disappointment, emotional dejection or sorrow at how recent events have turned out.");
	}

	@Test
	public void sixCupsTest() {
		Card sixCups = CardFactory.getCard(RANK.six, SUIT.cups);
		assertEquals(sixCups, new MinorArcana(RANK.six, SUIT.cups));
		assertEquals(sixCups.rank(), RANK.six.ordinal());
		assertEquals(sixCups.suit(), SUIT.cups);
		assertEquals(sixCups.name(), "six of cups");
		assertEquals(sixCups.meaning(), "Stands for innocence or nostalgia, and looking back fondly on better times.");
	}

	@Test
	public void sevenCupsTest() {
		Card sevenCups = CardFactory.getCard(RANK.seven, SUIT.cups);
		assertEquals(sevenCups, new MinorArcana(RANK.seven, SUIT.cups));
		assertEquals(sevenCups.rank(), RANK.seven.ordinal());
		assertEquals(sevenCups.suit(), SUIT.cups);
		assertEquals(sevenCups.name(), "seven of cups");
		assertEquals(sevenCups.meaning(), "This card contains seven complex symbols, which have disputed individual meanings.  Together, however, they symbolise ungrounded, impractical over-imagination.");
	}

	@Test
	public void eightCupsTest() {
		Card eightCups = CardFactory.getCard(RANK.eight, SUIT.cups);
		assertEquals(eightCups, new MinorArcana(RANK.eight, SUIT.cups));
		assertEquals(eightCups.rank(), RANK.eight.ordinal());
		assertEquals(eightCups.suit(), SUIT.cups);
		assertEquals(eightCups.name(), "eight of cups");
		assertEquals(eightCups.meaning(), "Usually represents a change in affections or affiliations, or a break with old links to the past.  Can also signify moving on from an ended, painful relationship.");
	}

	@Test
	public void nineCupsTest() {
		Card nineCups = CardFactory.getCard(RANK.nine, SUIT.cups);
		assertEquals(nineCups, new MinorArcana(RANK.nine, SUIT.cups));
		assertEquals(nineCups.rank(), RANK.nine.ordinal());
		assertEquals(nineCups.suit(), SUIT.cups);
		assertEquals(nineCups.name(), "nine of cups");
		assertEquals(nineCups.meaning(), "Often represents having your wish fulfilled, or enjoying sensual pleasure.");
	}

	@Test
	public void tenCupsTest() {
		Card tenCups = CardFactory.getCard(RANK.ten, SUIT.cups);
		assertEquals(tenCups, new MinorArcana(RANK.ten, SUIT.cups));
		assertEquals(tenCups.rank(), RANK.ten.ordinal());
		assertEquals(tenCups.suit(), SUIT.cups);
		assertEquals(tenCups.name(), "ten of cups");
		assertEquals(tenCups.meaning(), "Often reflects a fortunate marriage, or contentment with a romantic relationship.");
	}

	@Test
	public void pageCupsTest() {
		Card pageCups = CardFactory.getCard(RANK.page, SUIT.cups);
		assertEquals(pageCups, new MinorArcana(RANK.page, SUIT.cups));
		assertEquals(pageCups.rank(), RANK.page.ordinal());
		assertEquals(pageCups.suit(), SUIT.cups);
		assertEquals(pageCups.name(), "page of cups");
		assertEquals(pageCups.meaning(), "Represents a child who is dreamy and imaginative, and who loves home and family, but might have difficulties socially or at school.");
	}

	@Test
	public void knightCupsTest() {
		Card knightCups = CardFactory.getCard(RANK.knight, SUIT.cups);
		assertEquals(knightCups, new MinorArcana(RANK.knight, SUIT.cups));
		assertEquals(knightCups.rank(), RANK.knight.ordinal());
		assertEquals(knightCups.suit(), SUIT.cups);
		assertEquals(knightCups.name(), "knight of cups");
		assertEquals(knightCups.meaning(), "Represents change and excitement, typically of a romantic nature.");
	}

	@Test
	public void queenCupsTest() {
		Card queenCups = CardFactory.getCard(RANK.queen, SUIT.cups);
		assertEquals(queenCups, new MinorArcana(RANK.queen, SUIT.cups));
		assertEquals(queenCups.rank(), RANK.queen.ordinal());
		assertEquals(queenCups.suit(), SUIT.cups);
		assertEquals(queenCups.name(), "queen of cups");
		assertEquals(queenCups.meaning(), "Can represent a woman who is loving and pure of heart, but inverted this could warn of a deceitful lover or friend (usually a woman)");
	}

	@Test
	public void kingCupsTest() {
		Card kingCups = CardFactory.getCard(RANK.king, SUIT.cups);
		assertEquals(kingCups, new MinorArcana(RANK.king, SUIT.cups));
		assertEquals(kingCups.rank(), RANK.king.ordinal());
		assertEquals(kingCups.suit(), SUIT.cups);
		assertEquals(kingCups.name(), "king of cups");
		assertEquals(kingCups.meaning(), "Often predicts an encounter with a fair-haired, emotionally-complex man who is associated with Law or the Arts.");
	}


}
