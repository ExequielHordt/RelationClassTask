/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02.entity;

import java.util.ArrayList;

/**
 *
 * @author Exequiel Hordt
 * @version 18 Oct 2022
 */
public class Game {

    private ArrayList<Player> players;
    private WaterPistol waterPistol;

    public Game() {
    }

    public Game(ArrayList<Player> players, WaterPistol waterPistol) {
        this.players = players;
        this.waterPistol = waterPistol;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public WaterPistol getWaterPistol() {
        return waterPistol;
    }

    public void setWaterPistol(WaterPistol waterPistol) {
        this.waterPistol = waterPistol;
    }

}
