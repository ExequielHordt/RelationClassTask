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
public class Dog {

    private String name;
    private String breed;
    private Integer age;
    private double size;

    public Dog() {
    }

    public Dog(String name, String breed, Integer age, double size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    
}
