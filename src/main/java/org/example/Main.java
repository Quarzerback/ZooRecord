package org.example;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Karl", 45, "Karlsruhe");
        Owner owner2 =  new Owner("Otto", 15, "Ottohausen");

        Species bigCats = new Species("Big Cats", 4500);
        Species giraffes = new Species("Giraffes", 1900);
        Species elephantidae = new Species("Elephantidae", 50_000);

        Animal lion = new Animal("1", "Lion", bigCats, 8, owner);
        Animal giraffe = new Animal("2", "Giraffe", giraffes, 12, owner2);
        Animal tiger = new Animal("3", "Tiger", bigCats, 7, owner);
        Animal elephant = new Animal("4", "Elephant", elephantidae, 22, owner2);

        System.out.println(lion.equals(tiger));
        System.out.println(giraffe.hashCode());
        System.out.println(elephant.toString());
    }
}