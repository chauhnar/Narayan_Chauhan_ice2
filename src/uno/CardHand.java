/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author Dell
 */
public class CardHand {
    
    private int handSize = 108;
	public CardGame[] cards = new CardGame[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
		for(CardGame.Suit s: CardGame.Suit.values())
                {
                    for(CardGame.Value v: CardGame.Value.values())
                    {
                        cards[countCards] = (new CardGame(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method

    
}
