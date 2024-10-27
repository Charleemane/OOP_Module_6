package Module6;

public class Person {
    public int id; // No need for a setter or getter for public attibutes
    private String name;
    private int yob; // This is a write-only attribute
    private int age; // This is a read-only attribute

    //Setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setYOB(int newYOB){
        this.yob = newYOB;
    }

    // Getters
    public String getName(){
        return this.name.toUpperCase();
    }
    public int getAge(){
        this.age = 2024 - this.yob;
        return this.age;
    }

    public void displayInfo(){
        System.out.println("Name: " + this.getName());
        //TODO: create displayInfo for Teaching/NonTeaching
    }
}
