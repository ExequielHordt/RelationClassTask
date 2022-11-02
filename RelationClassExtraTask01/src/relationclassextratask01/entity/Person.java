/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclassextratask01.entity;

import java.util.ArrayList;

/**
 *
 * @author Exequiel Hordt
 */
public class Person {
    private String name;
    private String lastName;
    private int age;
    private long id;
    private ArrayList<Dog> dogList;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(ArrayList<Dog> dogList) {
        this.dogList = dogList;
    }

    @Override
    public String toString() {
        return "Propetario/a de la/s mascota/s: " + name + "\nMascota/s adoptadas: " + dogList;
    }
    
    
}
