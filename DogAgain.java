public class DogAgain {


    private String name;
    private int age;
    private String breed;

    // Create getters and setters for our fields

    //Create getter and setter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Create getter and setter for age
    public int getAge() {
        return this.age;
        // This would work as well because there is no ambiguity
        // return age;
    }

    public void setAge(int age){
        age = age;
    }

    // Create getter and setter for breed
    public void setBreed(String name) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    // Create a constructor for the Dog objects that will be created with the "new" keyword.
    // A constructor is a special method that is called or invoked when the Dog class is used...
    // to create an object.


    public DogAgain(String name, int age, String breed) {
        System.out.println("\nA dog object was created! New dog will appear below here:");
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

}


