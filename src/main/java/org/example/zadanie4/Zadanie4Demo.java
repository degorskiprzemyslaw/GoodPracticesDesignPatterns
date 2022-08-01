package org.example.zadanie4;

public class Zadanie4Demo {
    public static void main(String[] args) {
        Owner mike = new Owner("Mike", "Saiko");
        Computer computer = new Computer("Intel", 60);
        System.out.println("Hello I am " + mike.getName());
        System.out.println("and I have " + computer.getProcessor() + " processor");

    }


}
