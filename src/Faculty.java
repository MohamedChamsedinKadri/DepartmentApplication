import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
    private double salary;
    private List<Course> courses;

    public Faculty(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
        this.courses = new ArrayList<>();
    }

    public double getSalary() {
        return salary;
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public int getTotalUnits() {
        int total = 0;
        for (Course c : courses) {
            total += c.getUnits();
        }
        return total;
    }

    @Override
    public String getDetails() {
        return "Faculty: " + getName() + ", Phone: " + phone + ", Age: " + age + ", Salary: " + salary;
    }
}
