package cards;

public class CardFactory {

	public static Card getCard(RANK rank, SUIT suit){
		return new MinorArcana(rank, suit);
	}


}
