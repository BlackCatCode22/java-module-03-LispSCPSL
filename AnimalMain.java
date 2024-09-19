// TD 09/19/24
// Main.java
// Driver file for Animal and Hyena class usage

import java.io.BufferedReader;
import java.io.FileReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AnimalMain {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my Zoo Program!\n--------------------------");


        // Open the arriving animals file
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\BE218\\IdeaProjects\\arrivingAnimals.txt"));
            String myLine;

            // Read the file one line at a time
            while ((myLine = bufferedReader.readLine()) != null) {
                System.out.println(myLine);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        AnimalNum2 myAnimalObject = new AnimalNum2();  // New Animal Object
        // Use our new Animal object.
        myAnimalObject.setAge(4);
        System.out.println("\nMy animal's age is: " + myAnimalObject.getAge() + " years old.");


        Hyena myNewHyena = new Hyena(); // New Hyena Object
        // Output the age of our Hyena
        myNewHyena.setAge(7);
        System.out.println("The age of our Hyena is: " + myNewHyena.getAge() + " years old.");


        Lion myNewLion = new Lion(); // New Lion Object
        // Output the age of our Lion
        myNewLion.setAge(12);
        System.out.println("The age of our Lion is: " + myNewLion.getAge() + " years old.");


        // Output the number of Animals
        System.out.println("\nThe number of animals created is: " + AnimalNum2.numOfAnimals);

     }
}