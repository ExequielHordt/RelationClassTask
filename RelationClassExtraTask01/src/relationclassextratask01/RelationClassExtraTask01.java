/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclassextratask01;

import java.util.ArrayList;
import relationclassextratask01.entity.Dog;
import relationclassextratask01.entity.Person;
import relationclassextratask01.service.adoptionService;

/**
 *
 * @author Exequiel Hordt
 * @version 27 Oct 2022
 */
public class RelationClassExtraTask01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        adoptionService adoption = new adoptionService();
        ArrayList<Person> personList = new ArrayList<Person>();
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        adoption.menu(personList, dogs);
    }

}
