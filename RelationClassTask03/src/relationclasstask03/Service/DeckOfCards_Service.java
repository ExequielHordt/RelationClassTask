/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask03.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import relationclasstask03.Lists.Suits;
import relationclasstask03.entity.Card;
import relationclasstask03.entity.DeckOfCards;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Oct 2022
 */
public class DeckOfCards_Service {

    public DeckOfCards shuffle() {
        //Variables
        HashSet<Card> cardSet = new HashSet<>();
        DeckOfCards deckOfCards = new DeckOfCards();
        Card card;
        int i, j;
        //Procedures
        System.out.println("Se reciben las cartas");
        for (i = 0; i < 4; i++) {
            for (j = 1; j <= 10; j++) {
                card = new Card();
                if (j == 8 || j == 9) {
                    card.setNumber(j + 2);
                    for (Suits suits : Suits.values()) {
                        if (suits.getCode() == i) {
                            card.setSuit(suits);
                        }
                    }

                } else {
                    card.setNumber(j);
                    for (Suits suits : Suits.values()) {
                        if (suits.getCode() == i) {
                            card.setSuit(suits);
                        }
                    }
                }
                cardSet.add(card);
            }
        }
        deckOfCards.setCards(cardSet);
        return deckOfCards;
    }

    public void nextCard(DeckOfCards deckOfCards, ArrayList<Card> secondDeckOfCards) {
        //Procedures
        if (deckOfCards.getCards().isEmpty()) {
            System.out.println("No hay cartas");
        } else {
            Card card = deckOfCards.getCards().iterator().next();
            deckOfCards.getCards().remove(card);
            secondDeckOfCards.add(card);
            System.out.println("Carta dada");
        }

    }

    public int cardAvalaible(DeckOfCards deckOfCards) {
        return deckOfCards.getCards().size();
    }

    public void giveCard(DeckOfCards deckOfCards, ArrayList<Card> secondDeckOfCards) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int cardsGiven;
        Card card;
        System.out.println("Dar cartas");
        System.out.println("**********");
        System.out.print("Ingrese el número de cartas: ");
        cardsGiven = read.nextInt();
        if (cardsGiven > deckOfCards.getCards().size()) {
            System.out.println("");
            System.out.println("El número de cartas solicitas es mayor al que se tiene actualmente");
        } else {
            while (cardsGiven != 0) {
                card = deckOfCards.getCards().iterator().next();
                deckOfCards.getCards().remove(card);
                secondDeckOfCards.add(card);
                cardsGiven -= 1;
            }
            System.out.println("");
            System.out.println("Cartas dadas");
        }
    }

    public void stackCards(ArrayList<Card> secondDeckOfCards) {
        if (secondDeckOfCards.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        } else {
            Iterator<Card> it = secondDeckOfCards.iterator();
            while (it.hasNext()) {
                Card nextCard = it.next();
                System.out.print(nextCard);

            }
        }
    }

    public void showDeckOfCards(DeckOfCards deckOfCards) {
        Iterator<Card> it = deckOfCards.getCards().iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }

    public void menu(DeckOfCards deckOfCards, ArrayList<Card> secondDeckOfCards) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        char option;
        System.out.println("Barajar cartas");
        System.out.println("**************");
        do {
            System.out.print("Elija una de las siguientes opciones:\n1)Barajar\n2)Dar siguiente carta\n3)Cartas disponibles\n4)Dar cartas\n5)Cartas del monton\n6)Mostrar baraja\n7)Salir\nOpcion seleccionada: ");
            option = read.next().charAt(0);
            System.out.println("");
            switch (option) {
                case '1':
                    deckOfCards = shuffle();
                    System.out.println("");
                    break;
                case '2':
                    nextCard(deckOfCards, secondDeckOfCards);
                    System.out.println("");
                    break;
                case '3':
                    System.out.println("Quedan " + cardAvalaible(deckOfCards) + " cartas");
                    System.out.println("");
                    break;
                case '4':
                    giveCard(deckOfCards, secondDeckOfCards);
                    System.out.println("");
                    break;
                case '5':
                    stackCards(secondDeckOfCards);
                    System.out.println("");
                    System.out.println("");
                    break;
                case '6':
                    showDeckOfCards(deckOfCards);
                    System.out.println("");
                    System.out.println("");
                    break;
                case '7':
                    System.out.println("Fin del programa");
                    System.out.println("");
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    System.out.println("");
                    break;
            }
        } while (option != '7');

    }
}
