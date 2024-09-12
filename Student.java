package mystudent;

public class Student {
    private static int numOfStudents = 0;

    // Create a constructor for our new objects
    public Student() {
        numOfStudents++;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    // Give our Student class a few fields.
    String firstName;
    String lastName;
    double gpa;
    String major;
    int age;
    boolean onProbation;


    public static void SayHello() {
        System.out.println("\nHello from the Student Class! I am a static method and I belong to the Student class!");
    }

    public void sayHi() {
        System.out.println("\nHello, I must be from an object because I am not static.\n");
    }


}
