package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cards.Card;
import cards.CardFactory;
import cards.RANK;
import cards.MinorArcana;
import cards.SUIT;

/**<h2>Tests the creation of the wands suit</h2>
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
public class WandsCardTests {

	@Test
	public void aceWandsTest() {
		// creation
		Card aceWands = CardFactory.getCard(RANK.ace, SUIT.wands);
		// tests creation of right object
		assertEquals(aceWands, new MinorArcana(RANK.ace, SUIT.wands));
		// test rank
		assertEquals(aceWands.rank(), RANK.ace.ordinal());
		// test suit
		assertEquals(aceWands.suit(), SUIT.wands);
		// test correct name of each card
		assertEquals(aceWands.name(), "ace of wands");
		// test correct description of each card
		assertEquals(aceWands.meaning(), "Symbolises beginnings, birth or the starting point of enterprises.");
	}

	@Test
	public void twoWandsTest() {
		Card twoWands = CardFactory.getCard(RANK.two, SUIT.wands);
		assertEquals(twoWands, new MinorArcana(RANK.two, SUIT.wands));
		assertEquals(twoWands.rank(), RANK.two.ordinal());
		assertEquals(twoWands.suit(), SUIT.wands);
		assertEquals(twoWands.name(), "two of wands");
		assertEquals(twoWands.meaning(), "Most often means courage or daring, or starting out on a new path.");
	}

	@Test
	public void threeWandsTest() {
		Card threeWands = CardFactory.getCard(RANK.three, SUIT.wands);
		assertEquals(threeWands, new MinorArcana(RANK.three, SUIT.wands));
		assertEquals(threeWands.rank(), RANK.three.ordinal());
		assertEquals(threeWands.suit(), SUIT.wands);
		assertEquals(threeWands.name(), "three of wands");
		assertEquals(threeWands.meaning(), "Represents creation or looking forward to something with a sense of optimism.");
	}

	@Test
	public void fourWandsTest() {
		Card fourWands = CardFactory.getCard(RANK.four, SUIT.wands);
		assertEquals(fourWands, new MinorArcana(RANK.four, SUIT.wands));
		assertEquals(fourWands.rank(), RANK.four.ordinal());
		assertEquals(fourWands.suit(), SUIT.wands);
		assertEquals(fourWands.name(), "four of wands");
		assertEquals(fourWands.meaning(), "Reflects harmony and positive feelings, or hard work with good results.");
	}

	@Test
	public void fiveWandsTest() {
		Card fiveWands = CardFactory.getCard(RANK.five, SUIT.wands);
		assertEquals(fiveWands, new MinorArcana(RANK.five, SUIT.wands));
		assertEquals(fiveWands.rank(), RANK.five.ordinal());
		assertEquals(fiveWands.suit(), SUIT.wands);
		assertEquals(fiveWands.name(), "five of wands");
		assertEquals(fiveWands.meaning(), "Often connotes a sham fight, or taking part in another’s battles.");
	}

	@Test
	public void sixWandsTest() {
		Card sixWands = CardFactory.getCard(RANK.six, SUIT.wands);
		assertEquals(sixWands, new MinorArcana(RANK.six, SUIT.wands));
		assertEquals(sixWands.rank(), RANK.six.ordinal());
		assertEquals(sixWands.suit(), SUIT.wands);
		assertEquals(sixWands.name(), "six of wands");
		assertEquals(sixWands.meaning(), "Often reflects success or triumph.");
	}

	@Test
	public void sevenWandsTest() {
		Card sevenWands = CardFactory.getCard(RANK.seven, SUIT.wands);
		assertEquals(sevenWands, new MinorArcana(RANK.seven, SUIT.wands));
		assertEquals(sevenWands.rank(), RANK.seven.ordinal());
		assertEquals(sevenWands.suit(), SUIT.wands);
		assertEquals(sevenWands.name(), "seven of wands");
		assertEquals(sevenWands.meaning(), "Usually means fighting for one’s position, or for something that one believes in.");
	}

	@Test
	public void eightWandsTest() {
		Card eightWands = CardFactory.getCard(RANK.eight, SUIT.wands);
		assertEquals(eightWands, new MinorArcana(RANK.eight, SUIT.wands));
		assertEquals(eightWands.rank(), RANK.eight.ordinal());
		assertEquals(eightWands.suit(), SUIT.wands);
		assertEquals(eightWands.name(), "eight of wands");
		assertEquals(eightWands.meaning(), "Represents immediate action, or swiftly-travelling news.");
	}

	@Test
	public void nineWandsTest() {
		Card nineWands = CardFactory.getCard(RANK.nine, SUIT.wands);
		assertEquals(nineWands, new MinorArcana(RANK.nine, SUIT.wands));
		assertEquals(nineWands.rank(), RANK.nine.ordinal());
		assertEquals(nineWands.suit(), SUIT.wands);
		assertEquals(nineWands.name(), "nine of wands");
		assertEquals(nineWands.meaning(), "Represents order, or an unassailable or morally-superior position.");
	}

	@Test
	public void tenWandsTest() {
		Card tenWands = CardFactory.getCard(RANK.ten, SUIT.wands);
		assertEquals(tenWands, new MinorArcana(RANK.ten, SUIT.wands));
		assertEquals(tenWands.rank(), RANK.ten.ordinal());
		assertEquals(tenWands.suit(), SUIT.wands);
		assertEquals(tenWands.name(), "ten of wands");
		assertEquals(tenWands.meaning(), "Often signifies a large burden, or of spiritual or intellectual overload. The figure is depicted as working hard, but not able to see past his burden.");
	}

	@Test
	public void pageWandsTest() {
		Card pageWands = CardFactory.getCard(RANK.page, SUIT.wands);
		assertEquals(pageWands, new MinorArcana(RANK.page, SUIT.wands));
		assertEquals(pageWands.rank(), RANK.page.ordinal());
		assertEquals(pageWands.suit(), SUIT.wands);
		assertEquals(pageWands.name(), "page of wands");
		assertEquals(pageWands.meaning(), "Often signifies a new beginning, or the chance to make a success of a new venture.");
	}

	@Test
	public void knightWandsTest() {
		Card knightWands = CardFactory.getCard(RANK.knight, SUIT.wands);
		assertEquals(knightWands, new MinorArcana(RANK.knight, SUIT.wands));
		assertEquals(knightWands.rank(), RANK.knight.ordinal());
		assertEquals(knightWands.suit(), SUIT.wands);
		assertEquals(knightWands.name(), "knight of wands");
		assertEquals(knightWands.meaning(), "Depicted as a questing knight, this card usually signifies a purpose, or an adventure.");
	}

	@Test
	public void queenWandsTest() {
		Card queenWands = CardFactory.getCard(RANK.queen, SUIT.wands);
		assertEquals(queenWands, new MinorArcana(RANK.queen, SUIT.wands));
		assertEquals(queenWands.rank(), RANK.queen.ordinal());
		assertEquals(queenWands.suit(), SUIT.wands);
		assertEquals(queenWands.name(), "queen of wands");
		assertEquals(queenWands.meaning(), "Often symbolises directness, basic instinct, spontaneity and independence.");
	}

	@Test
	public void kingWandsTest() {
		Card kingWands = CardFactory.getCard(RANK.king, SUIT.wands);
		assertEquals(kingWands, new MinorArcana(RANK.king, SUIT.wands));
		assertEquals(kingWands.rank(), RANK.king.ordinal());
		assertEquals(kingWands.suit(), SUIT.wands);
		assertEquals(kingWands.name(), "king of wands");
		assertEquals(kingWands.meaning(), "Usually indicates decisiveness, but also quiet deliberation.  The King’s throne has no top, indicating the absence of limits.");
	}

}
