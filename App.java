package mystudent;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        System.out.println("\n\nWelcome to classes and object-oriented programming!\n");

        // Create First Student

        Student myStudent = new Student();


        myStudent.firstName = "Tyler";
        myStudent.lastName = "Dupree";
        myStudent.major = "Math";
        myStudent.gpa = 3.2;
        myStudent.age = 22;
        myStudent.onProbation = false;

        System.out.println("\n1st Student's First Name: " + myStudent.firstName);
        System.out.println("1st Student's Last Name: " + myStudent.lastName);
        System.out.println("1st Student's Major: " + myStudent.major);

        // Create Second Student

        Student mySecondStudent = new Student();

        mySecondStudent.firstName = "Justin";
        mySecondStudent.lastName = "Rodriguez";
        mySecondStudent.major = "Art";
        mySecondStudent.gpa = 2.8;
        mySecondStudent.age = 26;
        mySecondStudent.onProbation = true;

        System.out.println("\n\n2nd Student's First Name: " + mySecondStudent.firstName);
        System.out.println("2nd Student's Last Name: " + mySecondStudent.lastName);
        System.out.println("2nd Student's Major: " + mySecondStudent.major);


        // How many students?
        System.out.println("\n\nThere were " + Student.getNumOfStudents() + " Student objects created!");

        // Create a phone object
        Phone myNewPhone = new Phone();

        myNewPhone.model = "iPhone 16 Pro Max";
        myNewPhone.color = "Blue";
        myNewPhone.numOfCameras = 3;

        System.out.println("\n\n" + myStudent.firstName + " has the " + myNewPhone.model + ", which is the color " + myNewPhone.color + ".");

        // Create a second phone object
        Phone mySecondNewPhone = new Phone();

        mySecondNewPhone.model = "Samsung S24";
        mySecondNewPhone.color = "Red";
        mySecondNewPhone.numOfCameras = 2;

        System.out.println(mySecondStudent.firstName + " has the " + mySecondNewPhone.model + ", which is the color " + mySecondNewPhone.color + ".");



        // Create 100 students with an ArrayList - a handy data structure that is
        // flexible in size.
        ArrayList<Student> myStudentList = new ArrayList<>();

        for (int i = 0; i <100; i++) {
            Student newStudent = new Student();
            myStudent.firstName = "Student " + Integer.toString(i);
            myStudent.age = 99;
            myStudentList.add(myStudent);

        }
    }
}
