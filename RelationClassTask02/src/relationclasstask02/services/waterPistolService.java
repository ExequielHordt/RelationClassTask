/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02.services;

import relationclasstask02.entity.Game;
import relationclasstask02.entity.WaterPistol;

/**
 *
 * @author Exequiel Hordt
 * @version 18 Oct 2022
 */
public class waterPistolService {

    public void fillPistol(WaterPistol waterPistol, int numberPlayers) {

        waterPistol.setActualPosition((int) (Math.random() * numberPlayers) + 1);
        waterPistol.setWaterPosition((int) (Math.random() * numberPlayers) + 1);
    }

    public boolean wet(Game game) {
        return game.getWaterPistol().getActualPosition() == game.getWaterPistol().getWaterPosition();
    }

    public void nextJet(WaterPistol waterPistol) {
        if (waterPistol.getActualPosition() < 6) {
            waterPistol.setActualPosition(waterPistol.getActualPosition() + 1);
        } else {
            waterPistol.setActualPosition(1);
        }
    }

    public void showInfo(WaterPistol waterPistol) {
        System.out.println(waterPistol);
    }
}
