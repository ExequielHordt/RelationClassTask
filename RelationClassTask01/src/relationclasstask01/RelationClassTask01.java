/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask01;

import relationclasstask01.entity.Dog;
import relationclasstask01.entity.Person;


/**
 *
 * @author Exequiel Hordt
 * @version 12 Oct 2022
 */
public class RelationClassTask01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dog dog_01 = new Dog("Kiara", "Mini Pinscher", 10, 4.34);
       Dog dog_02 = new Dog("Bruna", "Mezcla", 1, 10.56);
       
       Person person_01 = new Person();
       Person person_02 = new Person();
       
       person_01.setName("Exequiel");
       person_01.setLastName("Hordt");
       person_01.setId(41070645);
       person_01.setDog(dog_01);
       
       person_02.setName("Agustina");
       person_02.setLastName("Quiros");
       person_02.setId(40392481);
       person_02.setDog(dog_02);
       
        System.out.println(person_01.toString());
        System.out.println("");
        System.out.println(person_02.toString());
    }
    
}
