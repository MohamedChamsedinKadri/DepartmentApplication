import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Person> members;
    private List<Course> courses;

    public Department(String name) {
        this.name = name;
        this.members = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addPerson(Person p) {
        members.add(p);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public double getTotalSalary() {
        double total = 0;
        for (Person p : members) {
            total += p.getSalary();
        }
        return total;
    }

    public void showAllMembers() {
        for (Person p : members) {
            System.out.println(p.getDetails());
        }
    }

    public void unitsPerFaculty() {
        for (Person p : members) {
            if (p instanceof Faculty) {
                Faculty f = (Faculty) p;
                System.out.println(f.getName() + ": " + f.getTotalUnits() + " units.");
            }
        }
    }
}
