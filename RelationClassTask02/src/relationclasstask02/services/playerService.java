/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02.services;

import java.util.ArrayList;
import java.util.Scanner;
import relationclasstask02.entity.Game;
import relationclasstask02.entity.Player;
import relationclasstask02.entity.WaterPistol;

/**
 *
 * @author Exequiel Hordt
 * @version 18 Oct 2022
 */
public class playerService {

    public ArrayList<Player> addPlayer(Player player) {
        //Variables
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int numberPlayers;
        ArrayList<Player> players = new ArrayList<>();

        //Procedures
        System.out.print("Ingrese el numero de jugadores: ");
        numberPlayers = read.nextInt();
        if (numberPlayers > 6) {
            numberPlayers = 6;
        }
        for (int i = 0; i < numberPlayers; i++) {
            System.out.println("");
            player = new Player();
            player.setId((int) (Math.random() * 6) + 1);
            System.out.println("Jugador " + (i + 1));
            System.out.print("Nombre: ");
            player.setName(read.next());
            players.add(player);
        }
        return players;
    }

    public boolean shoot(WaterPistol waterPistol, waterPistolService waterPistolServ, Player player, Game game) {
        if (waterPistolServ.wet(game)) {
            System.out.println("");
            player.setWet(true);
        } else {
            player.setWet(false);
            waterPistolServ.nextJet(waterPistol);
        }
        return player.isWet();
    }

}
