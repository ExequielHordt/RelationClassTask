/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclassextratask01.entity;

import relationclassextratask01.list.Breed;

/**
 *
 * @author Exequiel Hordt
 */
public class Dog {

    private String name;
    private Breed breed;
    private String size;
    private boolean adopted;

    public Dog() {
    }

    public Dog(String name, Breed breed, String size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.adopted = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    @Override
    public String toString() {
        return "[Nombre: " + name + ". Raza: " + breed.getName() + ". Tamaño: " + size + "] ";
    }

}
