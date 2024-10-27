package Module6;

public class Student extends Person {
    private String course;

    public void setCourse(String course){
        this.course = course;
    }

    public String getCourse(){
        return this.course;
    }

    public void displayInfo(){ // This overrides the same function in Person class
        super.displayInfo(); // Code reuseability
        System.out.println("Course: " + this.getCourse());
    }
}
