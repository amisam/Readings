package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cards.Card;
import cards.CardFactory;
import cards.RANK;
import cards.MinorArcana;
import cards.SUIT;

/**<h2>Tests the creation of the swords suit</h2>
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
public class SwordsCardsTests {

	@Test
	public void aceSwordsTest() {
		// creation
		Card aceSwords = CardFactory.getMinorCard(RANK.ace, SUIT.swords);
		// tests creation of right object
		assertEquals(aceSwords, new MinorArcana(RANK.ace, SUIT.swords));
		// test rank
		assertEquals(aceSwords.rank(), RANK.ace.ordinal());
		// test suit
		assertEquals(aceSwords.suit(), SUIT.swords);
		// test correct name of each card
		assertEquals(aceSwords.name(), "ace of swords");
		// test correct description of each card
		assertEquals(aceSwords.meaning(), "Indicates decisive ability, or cutting through confusion to get to the root of a problem.");
	}

	@Test
	public void twoSwordsTest() {
		Card twoSwords = CardFactory.getMinorCard(RANK.two, SUIT.swords);
		assertEquals(twoSwords, new MinorArcana(RANK.two, SUIT.swords));
		assertEquals(twoSwords.rank(), RANK.two.ordinal());
		assertEquals(twoSwords.suit(), SUIT.swords);
		assertEquals(twoSwords.name(), "two of swords");
		assertEquals(twoSwords.meaning(), "Represents a woman in control, even though she may not know the outcome of current events.  She holds powerful weapons, but not in an aggressive way.");
	}

	@Test
	public void threeSwordsTest() {
		Card threeSwords = CardFactory.getMinorCard(RANK.three, SUIT.swords);
		assertEquals(threeSwords, new MinorArcana(RANK.three, SUIT.swords));
		assertEquals(threeSwords.rank(), RANK.three.ordinal());
		assertEquals(threeSwords.suit(), SUIT.swords);
		assertEquals(threeSwords.name(), "three of swords");
		assertEquals(threeSwords.meaning(), "Represents powerful sorrow of the mind, which must be felt in full in order to allow for closure.");
	}

	@Test
	public void fourSwordsTest() {
		Card fourSwords = CardFactory.getMinorCard(RANK.four, SUIT.swords);
		assertEquals(fourSwords, new MinorArcana(RANK.four, SUIT.swords));
		assertEquals(fourSwords.rank(), RANK.four.ordinal());
		assertEquals(fourSwords.suit(), SUIT.swords);
		assertEquals(fourSwords.name(), "four of swords");
		assertEquals(fourSwords.meaning(), "May represent peaceful withdrawal, or quiet introspection in order to come to peace with recent events.");
	}

	@Test
	public void fiveSwordsTest() {
		Card fiveSwords = CardFactory.getMinorCard(RANK.five, SUIT.swords);
		assertEquals(fiveSwords, new MinorArcana(RANK.five, SUIT.swords));
		assertEquals(fiveSwords.rank(), RANK.five.ordinal());
		assertEquals(fiveSwords.suit(), SUIT.swords);
		assertEquals(fiveSwords.name(), "five of swords");
		assertEquals(fiveSwords.meaning(), "Often suggests impending victory, preparedness and confidence before a battle.");
	}

	@Test
	public void sixSwordsTest() {
		Card sixSwords = CardFactory.getMinorCard(RANK.six, SUIT.swords);
		assertEquals(sixSwords, new MinorArcana(RANK.six, SUIT.swords));
		assertEquals(sixSwords.rank(), RANK.six.ordinal());
		assertEquals(sixSwords.suit(), SUIT.swords);
		assertEquals(sixSwords.name(), "six of swords");
		assertEquals(sixSwords.meaning(), "This card can mean gradual change, or slow but persistent progress in moving away or past an obstacle.");
	}

	@Test
	public void sevenSwordsTest() {
		Card sevenSwords = CardFactory.getMinorCard(RANK.seven, SUIT.swords);
		assertEquals(sevenSwords, new MinorArcana(RANK.seven, SUIT.swords));
		assertEquals(sevenSwords.rank(), RANK.seven.ordinal());
		assertEquals(sevenSwords.suit(), SUIT.swords);
		assertEquals(sevenSwords.name(), "seven of swords");
		assertEquals(sevenSwords.meaning(), "Often implies hasty action or decisions, and can also mean hidden dishonour.");
	}

	@Test
	public void eightSwordsTest() {
		Card eightSwords = CardFactory.getMinorCard(RANK.eight, SUIT.swords);
		assertEquals(eightSwords, new MinorArcana(RANK.eight, SUIT.swords));
		assertEquals(eightSwords.rank(), RANK.eight.ordinal());
		assertEquals(eightSwords.suit(), SUIT.swords);
		assertEquals(eightSwords.name(), "eight of swords");
		assertEquals(eightSwords.meaning(), "Usually summed up as “damned if you do, damned if you don’t”, this card represents a difficult situation, and one from which you are prevented from escaping both by external obstacles and your own fears.");
	}

	@Test
	public void nineSwordsTest() {
		Card nineSwords = CardFactory.getMinorCard(RANK.nine, SUIT.swords);
		assertEquals(nineSwords, new MinorArcana(RANK.nine, SUIT.swords));
		assertEquals(nineSwords.rank(), RANK.nine.ordinal());
		assertEquals(nineSwords.suit(), SUIT.swords);
		assertEquals(nineSwords.name(), "nine of swords");
		assertEquals(nineSwords.meaning(), "Can mean doubts and pain, but the connotation of just having woken up implies that these may be imagined.");
	}

	@Test
	public void tenSwordsTest() {
		Card tenSwords = CardFactory.getMinorCard(RANK.ten, SUIT.swords);
		assertEquals(tenSwords, new MinorArcana(RANK.ten, SUIT.swords));
		assertEquals(tenSwords.rank(), RANK.ten.ordinal());
		assertEquals(tenSwords.suit(), SUIT.swords);
		assertEquals(tenSwords.name(), "ten of swords");
		assertEquals(tenSwords.meaning(), "Represents absolute destruction, or being pinned down and unable to move by your worries or responsibilities. When reversed it can be a warning to not be troubled in a seemingly-impossible situation.");
	}

	@Test
	public void pageSwordsTest() {
		Card pageSwords = CardFactory.getMinorCard(RANK.page, SUIT.swords);
		assertEquals(pageSwords, new MinorArcana(RANK.page, SUIT.swords));
		assertEquals(pageSwords.rank(), RANK.page.ordinal());
		assertEquals(pageSwords.suit(), SUIT.swords);
		assertEquals(pageSwords.name(), "page of swords");
		assertEquals(pageSwords.meaning(), "Symbolises a person possessed of a decisive nature, who doesn’t hesitate or fret over important decisions.");
	}

	@Test
	public void knightSwordsTest() {
		Card knightSwords = CardFactory.getMinorCard(RANK.knight, SUIT.swords);
		assertEquals(knightSwords, new MinorArcana(RANK.knight, SUIT.swords));
		assertEquals(knightSwords.rank(), RANK.knight.ordinal());
		assertEquals(knightSwords.suit(), SUIT.swords);
		assertEquals(knightSwords.name(), "knight of swords");
		assertEquals(knightSwords.meaning(), "Often symbolises a young man who fights bravely, but foolishly or without giving proper thought to his actions.");
	}

	@Test
	public void queenSwordsTest() {
		Card queenSwords = CardFactory.getMinorCard(RANK.queen, SUIT.swords);
		assertEquals(queenSwords, new MinorArcana(RANK.queen, SUIT.swords));
		assertEquals(queenSwords.rank(), RANK.queen.ordinal());
		assertEquals(queenSwords.suit(), SUIT.swords);
		assertEquals(queenSwords.name(), "queen of swords");
		assertEquals(queenSwords.meaning(), "Depicts a woman of intellect, who is familiar with pain and sorrow but understands their necessity in life.");
	}

	@Test
	public void kingSwordsTest() {
		Card kingSwords = CardFactory.getMinorCard(RANK.king, SUIT.swords);
		assertEquals(kingSwords, new MinorArcana(RANK.king, SUIT.swords));
		assertEquals(kingSwords.rank(), RANK.king.ordinal());
		assertEquals(kingSwords.suit(), SUIT.swords);
		assertEquals(kingSwords.name(), "king of swords");
		assertEquals(kingSwords.meaning(), "Usually represents a man who is strong-hearted, intellectual and decisive.");
	}

}