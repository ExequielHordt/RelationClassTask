/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask03;

import java.util.ArrayList;
import relationclasstask03.Service.DeckOfCards_Service;
import relationclasstask03.entity.Card;
import relationclasstask03.entity.DeckOfCards;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Oct 2022
 */
public class RelationClassTask03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeckOfCards_Service deckService = new DeckOfCards_Service();
        DeckOfCards deckOfCards = new DeckOfCards();
        ArrayList<Card> secondDeckOfCards = new ArrayList<Card>();
        deckService.menu(deckOfCards, secondDeckOfCards);
    }

}
