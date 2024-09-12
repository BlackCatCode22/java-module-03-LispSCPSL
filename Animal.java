package myanimals;

public class Animal {
    // There is not a "static" keyword here, so...
    // this method will be available to cat
    // Create a static member named numOfAnimals
    public static int numOfAnimals = 0;

    // Create a constructor
    public Animal() {
        numOfAnimals++;
    }




    public void animalSound() {
        System.out.println("\nA sound from the animal class:");
    }


}
