/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask03.entity;

import java.util.HashSet;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Oct 2022
 */
public class DeckOfCards {

    private HashSet<Card> cards;

    public DeckOfCards() {
    }

    public DeckOfCards(HashSet<Card> cards) {
        this.cards = cards;
    }

    public HashSet<Card> getCards() {
        return cards;
    }

    public void setCards(HashSet<Card> cards) {
        this.cards = cards;
    }
    
}
