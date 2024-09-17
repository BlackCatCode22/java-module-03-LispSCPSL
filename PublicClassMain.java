//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PublicClassMain {
    public static void main(String[] args) {

        System.out.println("\nWelcome to the OOP Class Practice Program!");

        DogAgain myDog = new DogAgain("Ranger", 5, "German Shepard");
        System.out.println("'Tyler has a dog named " + myDog.getName() + ", at age " + myDog.getAge() + ". He is a " + myDog.getBreed() + ".'\n");

        DogAgain mySecondDog = new DogAgain("Luna", 8, "Yorkie");
        System.out.println("'Jonathan has a dog named " + mySecondDog.getName() + ", at age " + mySecondDog.getAge() + ". She is a " + mySecondDog.getBreed() + ".'\n");

        // Give our dog a birthday (add a year to its age)
        myDog.setAge(myDog.getAge() + 1);
        System.out.println("\nMy dog, who is named " + myDog.getName() + ", just had their birthday, and their age is now: " + myDog.getAge() );


    }

}
