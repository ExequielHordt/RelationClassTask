/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02;

import relationclasstask02.entity.Game;
import relationclasstask02.entity.Player;
import relationclasstask02.entity.WaterPistol;
import relationclasstask02.services.gameService;
import relationclasstask02.services.playerService;
import relationclasstask02.services.waterPistolService;

/**
 *
 * @author Exequiel Hordt
 * @version 17 Oct 2022
 */
public class RelationClassTask02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Player player = new Player();
        Game game = new Game();
        gameService gameServ = new gameService();
        playerService playerServ = new playerService();
        waterPistolService waterPistolServ = new waterPistolService();
        WaterPistol waterPistol = new WaterPistol();
        //Procedures
        gameServ.fillGame(playerServ.addPlayer(player), waterPistol, game, waterPistolServ);
        gameServ.round(game, playerServ, waterPistolServ);
    }

}
