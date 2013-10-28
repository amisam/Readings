package cards;

/**<h1>Card Factory</h1>
 * <p>Will produce:
 * 	<ul>
 *  	<li>A given card</li>
 *  	<li>A deck</li>
 *  	<li>Given a card will produce a deck without the given card</li>
 *  	<li>A deck with the specified number of major and minor arcana</li>
 * 	</ul>
 * </p>
 * @author hartesamu
 *
 */
public class CardFactory {

	/**<p>
	 * 	Produces a single card of the given rank and suit
	 * </p>
	 * @param rank, the cards rank - for the minor arcana
	 * @param suit, the cards suit - 0-21 the major arcana, 22-25 the minor arcana's suits
	 * @return Card, a card made from the given rank and suit
	 */
	public static Card getMinorCard(RANK rank, SUIT suit){
		return new MinorArcana(rank, suit);
	}

	public static Card getMajorCard(SUIT suit){
		return new MajorArcana(suit);
	}


}
