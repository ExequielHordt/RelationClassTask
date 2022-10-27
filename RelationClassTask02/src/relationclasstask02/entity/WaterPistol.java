/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02.entity;

/**
 *
 * @author Exequiel Hordt
 * @version 18 Oct 2022
 */
public class WaterPistol {

    private Integer actualPosition;
    private Integer waterPosition;

    public WaterPistol() {
    }

    public WaterPistol(Integer actualPosition, Integer waterPosition) {
        this.actualPosition = actualPosition;
        this.waterPosition = waterPosition;
    }

    public Integer getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(Integer actualPosition) {
        this.actualPosition = actualPosition;
    }

    public Integer getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(Integer waterPosition) {
        this.waterPosition = waterPosition;
    }

    @Override
    public String toString() {
        return "Posicion Actual: " + actualPosition + "\nPosicion del Agua: " + waterPosition;
    }

}
