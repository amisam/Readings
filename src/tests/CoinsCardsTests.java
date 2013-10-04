package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cards.Card;
import cards.CardFactory;
import cards.RANK;
import cards.MinorArcana;
import cards.SUIT;

/**<h2>Tests the creation of the coins suit</h2>
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
public class CoinsCardsTests {

	@Test
	public void aceCoinsTest() {
		// creation
		Card aceCoins = CardFactory.getCard(RANK.ace, SUIT.coins);
		// tests creation of right object
		assertEquals(aceCoins, new MinorArcana(RANK.ace, SUIT.coins));
		// test rank
		assertEquals(aceCoins.rank(), RANK.ace.ordinal());
		// test suit
		assertEquals(aceCoins.suit(), SUIT.coins);
		// test correct name of each card
		assertEquals(aceCoins.name(), "ace of coins");
		// test correct description of each card
		assertEquals(aceCoins.meaning(), "Symbolises new beginnings or great potential, typically in material matters.");
	}

	@Test
	public void twoCoinsTest() {
		Card twoCoins = CardFactory.getCard(RANK.two, SUIT.coins);
		assertEquals(twoCoins, new MinorArcana(RANK.two, SUIT.coins));
		assertEquals(twoCoins.rank(), RANK.two.ordinal());
		assertEquals(twoCoins.suit(), SUIT.coins);
		assertEquals(twoCoins.name(), "two of coins");
		assertEquals(twoCoins.meaning(), "Can mean to balance responsibilities, but it can also symbolise excessive juggling of too many obligations.");
	}

	@Test
	public void threeCoinsTest() {
		Card threeCoins = CardFactory.getCard(RANK.three, SUIT.coins);
		assertEquals(threeCoins, new MinorArcana(RANK.three, SUIT.coins));
		assertEquals(threeCoins.rank(), RANK.three.ordinal());
		assertEquals(threeCoins.suit(), SUIT.coins);
		assertEquals(threeCoins.name(), "three of coins");
		assertEquals(threeCoins.meaning(), "Generally indicates the mastery of a skill or trade.");
	}

	@Test
	public void fourCoinsTest() {
		Card fourCoins = CardFactory.getCard(RANK.four, SUIT.coins);
		assertEquals(fourCoins, new MinorArcana(RANK.four, SUIT.coins));
		assertEquals(fourCoins.rank(), RANK.four.ordinal());
		assertEquals(fourCoins.suit(), SUIT.coins);
		assertEquals(fourCoins.name(), "four of coins");
		assertEquals(fourCoins.meaning(), "Refers to a lover of material wealth, who hoards treasures with no intention of sharing.");
	}

	@Test
	public void fiveCoinsTest() {
		Card fiveCoins = CardFactory.getCard(RANK.five, SUIT.coins);
		assertEquals(fiveCoins, new MinorArcana(RANK.five, SUIT.coins));
		assertEquals(fiveCoins.rank(), RANK.five.ordinal());
		assertEquals(fiveCoins.suit(), SUIT.coins);
		assertEquals(fiveCoins.name(), "five of coins");
		assertEquals(fiveCoins.meaning(), "Often suggests a grim or dire situation, and one which the querant may not be soon clear of.");
	}

	@Test
	public void sixCoinsTest() {
		Card sixCoins = CardFactory.getCard(RANK.six, SUIT.coins);
		assertEquals(sixCoins, new MinorArcana(RANK.six, SUIT.coins));
		assertEquals(sixCoins.rank(), RANK.six.ordinal());
		assertEquals(sixCoins.suit(), SUIT.coins);
		assertEquals(sixCoins.name(), "six of coins");
		assertEquals(sixCoins.meaning(), "Represents satisfaction, and the guarding of material wealth.  Can also mean envy if reversed.");
	}

	@Test
	public void sevenCoinsTest() {
		Card sevenCoins = CardFactory.getCard(RANK.seven, SUIT.coins);
		assertEquals(sevenCoins, new MinorArcana(RANK.seven, SUIT.coins));
		assertEquals(sevenCoins.rank(), RANK.seven.ordinal());
		assertEquals(sevenCoins.suit(), SUIT.coins);
		assertEquals(sevenCoins.name(), "seven of coins");
		assertEquals(sevenCoins.meaning(), "Represents the reward of working hard as its own end, but reversed it can mean giving too much time or energy to a fruitless task.");
	}

	@Test
	public void eightCoinsTest() {
		Card eightCoins = CardFactory.getCard(RANK.eight, SUIT.coins);
		assertEquals(eightCoins, new MinorArcana(RANK.eight, SUIT.coins));
		assertEquals(eightCoins.rank(), RANK.eight.ordinal());
		assertEquals(eightCoins.suit(), SUIT.coins);
		assertEquals(eightCoins.name(), "eight of coins");
		assertEquals(eightCoins.meaning(), "Means hard work which will have good payoffs, but can also mean the perversion of skill if reversed.");
	}

	@Test
	public void nineCoinsTest() {
		Card nineCoins = CardFactory.getCard(RANK.nine, SUIT.coins);
		assertEquals(nineCoins, new MinorArcana(RANK.nine, SUIT.coins));
		assertEquals(nineCoins.rank(), RANK.nine.ordinal());
		assertEquals(nineCoins.suit(), SUIT.coins);
		assertEquals(nineCoins.name(), "nine of coins");
		assertEquals(nineCoins.meaning(), "Can mean financial independence, or excess spending when reversed.");
	}

	@Test
	public void tenCoinsTest() {
		Card tenCoins = CardFactory.getCard(RANK.ten, SUIT.coins);
		assertEquals(tenCoins, new MinorArcana(RANK.ten, SUIT.coins));
		assertEquals(tenCoins.rank(), RANK.ten.ordinal());
		assertEquals(tenCoins.suit(), SUIT.coins);
		assertEquals(tenCoins.name(), "ten of coins");
		assertEquals(tenCoins.meaning(), "Often associated with family wealth or affluence.");
	}

	@Test
	public void pageCoinsTest() {
		Card pageCoins = CardFactory.getCard(RANK.page, SUIT.coins);
		assertEquals(pageCoins, new MinorArcana(RANK.page, SUIT.coins));
		assertEquals(pageCoins.rank(), RANK.page.ordinal());
		assertEquals(pageCoins.suit(), SUIT.coins);
		assertEquals(pageCoins.name(), "page of coins");
		assertEquals(pageCoins.meaning(), "Primarily means changing your line of work, or a new career.  It is usually associated with students.");
	}

	@Test
	public void knightCoinsTest() {
		Card knightCoins = CardFactory.getCard(RANK.knight, SUIT.coins);
		assertEquals(knightCoins, new MinorArcana(RANK.knight, SUIT.coins));
		assertEquals(knightCoins.rank(), RANK.knight.ordinal());
		assertEquals(knightCoins.suit(), SUIT.coins);
		assertEquals(knightCoins.name(), "knight of coins");
		assertEquals(knightCoins.meaning(), "Represents a young man of dark complexion, usually one who is stubborn or set in his ways.");
	}

	@Test
	public void queenCoinsTest() {
		Card queenCoins = CardFactory.getCard(RANK.queen, SUIT.coins);
		assertEquals(queenCoins, new MinorArcana(RANK.queen, SUIT.coins));
		assertEquals(queenCoins.rank(), RANK.queen.ordinal());
		assertEquals(queenCoins.suit(), SUIT.coins);
		assertEquals(queenCoins.name(), "queen of coins");
		assertEquals(queenCoins.meaning(), "Represents a woman of knowledge or wisdom, but can also signify the neglect of responsibilities if reversed.");
	}

	@Test
	public void kingCoinsTest() {
		Card kingCoins = CardFactory.getCard(RANK.king, SUIT.coins);
		assertEquals(kingCoins, new MinorArcana(RANK.king, SUIT.coins));
		assertEquals(kingCoins.rank(), RANK.king.ordinal());
		assertEquals(kingCoins.suit(), SUIT.coins);
		assertEquals(kingCoins.name(), "king of coins");
		assertEquals(kingCoins.meaning(), "Often symbolises a man of great earthly power, often political. Often signifies a man who can help the querant with a question in their life.");
	}

}
