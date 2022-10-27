/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask03.Lists;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Oct 2022
 */
public enum Suits {
    SWORDS(0, "Espada"), CUPS(1, "Copa"), COINS(2, "Oro"), CLUBS(3, "Bastos");

    private int code;
    private String name;

    private Suits(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
