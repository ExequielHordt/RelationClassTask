/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclassextratask01.list;

/**
 *
 * @author Exequiel Hordt
 * @version 27 Oct 2022
 */
public enum Breed {
    GOLDEN_RETRIEVER(1, "Golden Retriever"), BOSTON_TERRIER(2, "Boston Terrier"), LABRADOR_RETRIEVER(3, "Labrador Retriever"), POODLE(4, "Poodle"), BORDER_COLLIE(5, "Border Collie"), BEAGLE(6, "Beagle");

    private String name;
    private int code;

    private Breed(int code, String name) {
        this.name = name;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
