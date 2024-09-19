public class AnimalNum2 {
    static int numOfAnimals = 0; // Created static int that keeps track of the num of animals created

    public AnimalNum2() { // Created a constructor for our new Animal Objects
        numOfAnimals++;
    }

    // Create a few attributes (fields)
    private String sex = "";   // sex will be 'male' or 'female'
    private int age = 0; // age will be in years
    private int weight = 0; //weight will be in pounds

    // Create getters and setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
