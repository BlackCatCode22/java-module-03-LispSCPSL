package myanimals;

public class Cat extends Animal {
    // the Cat class is a subclass of Animal.
    // so it should have all the methods from the animal class
    // available to it.
    // This is polymorphism - this word means "many shapes"
    // when used here, by a Cat object, this method that has the same name
    // as the method in the superclass, take another shape.

    public String name;
    public int age;
    int livesRemaining;

public void meow(){
    System.out.println("Meow!");
   }

   public void animalSound() {
       System.out.println("\nA sound from the animal class:");
   }

    }