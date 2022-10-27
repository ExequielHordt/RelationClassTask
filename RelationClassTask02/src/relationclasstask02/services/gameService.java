/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02.services;

import java.util.ArrayList;
import relationclasstask02.entity.Game;
import relationclasstask02.entity.Player;
import relationclasstask02.entity.WaterPistol;

/**
 *
 * @author Exequiel Hordt
 * @version 18 Oct 2022
 */
public class gameService {

    public void fillGame(ArrayList<Player> players, WaterPistol waterPistol, Game game, waterPistolService waterPistolServ) {
        game.setPlayers(players);
        waterPistolServ.fillPistol(waterPistol, players.size());
        game.setWaterPistol(waterPistol);
    }

    public void round(Game game, playerService playerServ, waterPistolService waterPistolServ) {
//Variables
        int counter;
        counter = 0;
        //Procedures
        do {
            if (counter == game.getPlayers().size() - 1) {
                counter = 0;
            } else {
                counter += 1;
            }
            playerServ.shoot(game.getWaterPistol(), waterPistolServ, game.getPlayers().get(counter), game);

        } while (game.getPlayers().get(counter).isWet() != true);
        System.out.println("El jugador -> " + game.getPlayers().get(counter).getName() + " (ID: " + game.getPlayers().get(counter).getId() + ")" + " ha sido mojado/a.");

    }
}
