/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask03.entity;

import relationclasstask03.Lists.Suits;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Oct 2022
 */
public class Card {

    private int number;
    private Suits suit;

    public Card() {
    }

    public Card(int number, Suits suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "[Numero: " + number + " - Palo: " + suit.getName() + "] ";
    }

}
