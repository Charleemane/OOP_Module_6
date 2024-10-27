package Module6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create an instance of the Student
        // Student stud1 = new Student();

        //TODO: create a menu

        // Declare the Student object
        Student stud1;

        //Declare Employee obj
        Employee emp1;

        // Declare variables for input;
        int id;
        String name;
        int yob;
        String course;

        System.out.print("Enter ID Number: ");
        id = input.nextInt();
        input.nextLine(); // Same as cin.ignore()
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter year of birth: ");
        yob = input.nextInt();
        input.nextLine(); // Same as cin.ignore()
        System.out.print("Enter course: ");
        course = input.nextLine();

        // Instantiate the Student object
        stud1 = new Student();
        // Assign the inputted values using setters
        stud1.id = id;
        stud1.setName(name);
        stud1.setYOB(yob);
        stud1.setCourse(course);

        System.out.println();
        System.out.println("STUDENT INFORMATION");
        System.out.println("ID: " + stud1.id);
        System.out.println("Name: " + stud1.getName());
        System.out.println("Age: " + stud1.getAge());
        System.out.println("Course: " + stud1.getCourse());


        // Declare variables
        String department;
        int numOfUnits;
        String role;

        System.out.print("Enter ID Number: ");
        id = input.nextInt();
        input.nextLine(); // Same as cin.ignore()
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter year of birth: ");
        yob = input.nextInt();
        input.nextLine(); // Same as cin.ignore()
        System.out.println("Enter department: ");
        department = input.nextLine();

        //Instantiate Employee obj
        emp1 = new Employee();

        emp1.id = id;
        emp1.setName(name);
        emp1.setYOB(yob);
        emp1.department(department.toLowerCase);

        //Instantiate Teaching obj
        teach1 = new Teaching();

        //Instantiate NonTeaching obj
        nonteach1 = new NonTeaching();

        //if else statement for teaching/non-teaching
        if (department == 'teaching') {
            System.out.println("Enter number of units: ");
            numOfUnits = input.nextInt();
            teach1.setNumOfUnits(numOfUnits);
        } else if (department == 'nonteaching') {
            System.out.print("Enter role: ");
            role = input.nextLine();
            nonteach1.setRole(role);
        }

        // Instantiate Employee object
        /*emp1 = new Employee();

        emp1.id = id;
        emp1.setName(name);
        emp1.setYOB(yob);
        emp1.setDeparment(department.toLowerCase);

        System.out.println();
        stud1.displayInfo();*/

        /*
            TODO: Complete this program by implementing the Teaching and NonTeaching
            classes. All information required must be entered and diplayed using the
            provided methods in the said classes.
        */

        input.close();
    }
}