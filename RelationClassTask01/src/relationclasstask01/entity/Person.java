/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask01.entity;

/**
 *
 * @author Exequiel Hordt
 * @version 12 Oct 2022
 */
public class Person {
    private String name;
    private String lastName;
    private long id;
    private Dog dog;

    public Person() {
    }

    public Person(String name, String lastName, long id, Dog dog) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + " Perro: " + dog.getName();
    }
    
    
}
