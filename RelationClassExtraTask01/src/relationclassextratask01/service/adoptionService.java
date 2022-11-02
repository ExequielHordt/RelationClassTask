/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclassextratask01.service;

import java.util.ArrayList;
import java.util.Scanner;
import relationclassextratask01.entity.Dog;
import relationclassextratask01.entity.Person;
import relationclassextratask01.list.Breed;

/**
 *
 * @author Exequiel Hordt
 * @version 27 Oct 2022
 */
public class adoptionService {

    public ArrayList<Person> addPerson() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Person> personList = new ArrayList<Person>();
        Person person;
        int personNumber, i;
        System.out.println("Programa de adopcion");
        System.out.println("********************");
        do {
            System.out.print("Ingrese el numero de personas adoptantes: ");
            personNumber = read.nextInt();
            if (personNumber == 0) {
                System.out.println("El dato ingresado no es correcto. Vuelva a intenterlo");
            }
        } while (personNumber == 0);
        for (i = 0; i < personNumber; i++) {
            person = new Person();
            System.out.print("Nombre de la persona " + (i + 1) + ": ");
            person.setName(read.next());
            personList.add(person);
        }
        System.out.println("Las personas han sido agregadas con exito");
        return personList;
    }

    public ArrayList<Dog> addDog() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        Dog dog;
        int dogNumber, i, breedNumber;

        do {
            System.out.print("Ingrese el numero de perros para adoptar: ");
            dogNumber = read.nextInt();
            if (dogNumber == 0) {
                System.out.println("El dato ingresado no es correcto. Vuelva a intenterlo");
            }
        } while (dogNumber == 0);
        for (i = 0; i < dogNumber; i++) {
            dog = new Dog();
            breedNumber = ((int) (Math.random() * 6) + 1);
            System.out.print("Nombre del perro/a " + (i + 1) + ": ");
            dog.setName(read.next());
            for (Breed breed : Breed.values()) {
                if (breedNumber == breed.getCode()) {
                    dog.setBreed(breed);
                }

            }
            System.out.println("Raza: " + dog.getBreed().getName());
            System.out.print("Tamaño: ");
            dog.setSize(read.next());
            dogList.add(dog);
        }
        System.out.println("Se ha completado con exito la lista de perros para adoptar");
        return dogList;
    }

    public ArrayList<Person> adopt(ArrayList<Person> persons, ArrayList<Dog> dogs) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String nameDog;
        ArrayList<Dog> dogsAdopted;
        char option;
        boolean flagAdopt, flagName;
        flagName = false;
        flagAdopt = true;
        //Procedures
        for (Person person : persons) {
            dogsAdopted = new ArrayList<Dog>();
            do {
                System.out.print(person.getName() + "," + "ingrese el nombre del perro que desee adoptar: ");
                nameDog = read.next();
                for (Dog dog : dogs) {
                    if (nameDog.equalsIgnoreCase(dog.getName())) {
                        flagName = true;
                        if (dog.isAdopted() == false) {
                            System.out.println("Felicidades has adoptado a " + dog.getName());
                            System.out.println("Cuidalo/a!");
                            dog.setAdopted(true);
                            dogsAdopted.add(dog);
                            flagAdopt = false;
                            break;
                        }
                    }
                }
                if (flagName == true && flagAdopt == true) {
                    System.out.println("Disculpe. Ya se encuentra adoptado/a.");
                }

                if (flagName == false) {
                    System.out.println("Disculpe. El nombre ingresado no se encuentra en nuestra bases de datos.\nPor favor, vuelva a intentarlo");
                }
                flagName = false;
                flagAdopt = true;
                System.out.print("¿Desea adoptar otro perro/a? presione S para continuar o N para finalizar: ");
                option = Character.toUpperCase(read.next().charAt(0));
            } while (option != 'N');
            person.setDogList(dogsAdopted);
        }
        return persons;
    }

    public void show_dogsAdopted(ArrayList<Person> persons) {
        ArrayList<Person> noAdoptList = new ArrayList<Person>();
        ArrayList<Person> AdoptList = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getDogList().isEmpty()) {
                noAdoptList.add(person);
            } else {
                AdoptList.add(person);
            }
        }
        if (noAdoptList.isEmpty() == false) {
            System.out.println("La lista de personas que no adoptaron es: ");
            System.out.println("*******************************************");
            for (Person person : noAdoptList) {
                System.out.println(person.getName());
            }
        }
        if (AdoptList.isEmpty() == false) {
            System.out.println("La lista de personas que adoptaron es: ");
            System.out.println("*******************************************");
            for (Person person : AdoptList) {
                System.out.println(person);
            }
        }

    }

    public void menu(ArrayList<Person> persons, ArrayList<Dog> dogs) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int option;
        boolean flagOption_1, flagOption_2, flagOption_3;
        flagOption_1 = false;
        flagOption_2 = false;
        flagOption_3 = false;
        System.out.println("Sistema de adopcion de perros");
        System.out.println("*****************************");
        do {
            System.out.print("Ingrese una opcion:\n1) Agregar personas\n2) Agregar perros\n3) Adoptar\n4) Mostrar lista\n5) Salir\nOpcion seleccionada: ");
            option = read.nextInt();
            switch (option) {
                case 1:
                    if (flagOption_1 == false) {
                        persons = addPerson();
                        System.out.println("");
                        flagOption_1 = true;
                    } else {
                        System.out.println("¡Las personas ya fueron agregadas a una lista!");
                    }
                    break;
                case 2:
                    if (flagOption_2 == false) {
                        flagOption_2 = true;
                        dogs = addDog();
                        System.out.println("");
                    } else {
                        System.out.println("¡Los perros ya fueron agregados a una lista!");
                    }
                    break;
                case 3:
                    if (flagOption_1 == true && flagOption_2 == true) {
                        flagOption_3 = true;
                        persons = adopt(persons, dogs);
                        System.out.println("");
                    } else {
                        System.out.println("¡Primero debe crear la lista de personas y/o perros antes de acceder a esta opcion!");
                    }
                    break;
                case 4:
                    if (flagOption_3 == true) {
                        show_dogsAdopted(persons);
                        System.out.println("");
                    } else {
                        System.out.println("¡Primero debe realizar la operacion ADOPTAR antes de acceder a esta opcion!");
                    }
                    break;
                case 5:
                    System.out.print("¿Desea salir del programa? Presione la tecla S para salir. Presione cualquier otra tecla para volver al menu.");
                    option = Character.toLowerCase(read.next().charAt(0));
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta. Por favor, ingrese una opcion correcta");

            }
        } while (option != 's');
        System.out.println("Fin del programa");
    }
}
