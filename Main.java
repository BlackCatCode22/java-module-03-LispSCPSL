//Td 09/12/2024

import myanimals.Animal;
import myanimals.Dog;
import mystudent.Student;
import mystudent.App;
import myanimals.Cat;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nHello, this is the main source of my code.\n");

        // Create a Student object
        Student student = new Student();

        // Create an object from a runnable class
        App app = new App();

        // Use a method from the Student class
        // I know that I have a static method on the Student class
        // and I know how to call a static class method
        Student.SayHello();

        // Call a method that belongs to the Student object.
        student.sayHi();


        //Output the number of animals before any are created
        System.out.println("\nThe number of animals before any are created is: " + Animal.numOfAnimals + "\n");


        // Create a cat object.
        Cat myCat = new Cat();
        // use a method that is available to the Cat object named cat
        System.out.println("\nThis method demonstrates that the sound is coming from the Cat object named mycat...");
        myCat.animalSound();
        myCat.meow();

        // Create a dog object.
        Dog myDog = new Dog();
        System.out.println("\n\nThis method demonstrates that the sound is coming from the Dog object named mydog...");
        myDog.animalSound();
        myDog.bark();

        //Output the number of animals after they are created
        System.out.println("\nThe number of animals after being created is: " + Animal.numOfAnimals + "\n");


    }
}