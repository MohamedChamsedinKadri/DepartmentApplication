import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a skeleton class that you can use for guidance in starting the lab.
 *
 * You should update any comments,
 * variable names, etc to follow the class coding conventions.
 */

public class DepartmentApplication {
    public static void main(String[] args) throws IOException {
        Department dept = new Department("ComputerScience");

        // Create faculty objects
        Person frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000);
        Person samHoward = new Faculty("Sam Howard", "472-7222", 55, 9500);
        Person johnDoodle = new Faculty("John Doodle", "472-6190", 39, 8600);

        dept.addPerson(frankMoore);
        dept.addPerson(samHoward);
        dept.addPerson(johnDoodle);

        // Create student objects
        Person johnDoe = new Student("John Doe", "472-1121", 22, 4.0);
        Person maryJones = new Student("Mary Jones", "472-7322", 32, 3.80);
        Person leeJohnson = new Student("Lee Johnson", "472-6009", 19, 3.65);

        dept.addPerson(johnDoe);
        dept.addPerson(maryJones);
        dept.addPerson(leeJohnson);

        // Create staff objects
        Person frankGore = new Staff("Frank Gore", "472-3321", 33, 4050);
        Person adamDavis = new Staff("Adam Davis", "472-7552", 50, 5500);
        Person davidHeck = new Staff("David Heck", "472-8890", 29, 3600);

        dept.addPerson(frankGore);
        dept.addPerson(adamDavis);
        dept.addPerson(davidHeck);

        // Create course objects
        Course cs201 = new Course("cs201", "programming", 4, (Faculty) johnDoodle);
        Course cs360 = new Course("cs360", "database", 3, (Faculty) samHoward);
        Course cs404 = new Course("cs404", "compiler", 4, (Faculty) johnDoodle);
        Course cs240 = new Course("cs240", "datastructure", 2, (Faculty) johnDoodle);
        Course cs301 = new Course("cs301", "Software engg", 3, (Faculty) samHoward);
        Course cs450 = new Course("cs450", "Advanced architecture", 5, (Faculty) frankMoore);

        // Assign courses to faculty
        ((Faculty) johnDoodle).addCourse(cs201);
        ((Faculty) johnDoodle).addCourse(cs404);
        ((Faculty) johnDoodle).addCourse(cs240);
        ((Faculty) samHoward).addCourse(cs360);
        ((Faculty) samHoward).addCourse(cs301);
        ((Faculty) frankMoore).addCourse(cs450);

        // Assign courses to students
        ((Student) johnDoe).addCourse(cs201);
        ((Student) johnDoe).addCourse(cs360);
        ((Student) johnDoe).addCourse(cs404);
        ((Student) johnDoe).addCourse(cs301);
        ((Student) maryJones).addCourse(cs201);
        ((Student) maryJones).addCourse(cs404);
        ((Student) maryJones).addCourse(cs450);
        ((Student) leeJohnson).addCourse(cs201);
        ((Student) leeJohnson).addCourse(cs360);
        ((Student) leeJohnson).addCourse(cs240);
        ((Student) leeJohnson).addCourse(cs450);

        double totalSalary = 0;

        while (true) {
            System.out.print("Enter first letter of getTotalSalary, showAllMembers, unitsPerFaculty or quit: ");
            int choice = System.in.read();
            System.in.read();  // Consume newline
            switch (choice) {
                case 'g':
                    totalSalary = dept.getTotalSalary();
                    System.out.println("Total sum of all salaries is: " + totalSalary + "\n");
                    break;
                case 's':
                    dept.showAllMembers();
                    break;
                case 'u':
                    dept.unitsPerFaculty();
                    break;
                case 'q':
                    return;
                default:
                    System.out.println("Invalid entry\n");
            }
        }
    }
}
