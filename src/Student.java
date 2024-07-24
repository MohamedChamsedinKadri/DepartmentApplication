import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private double gpa;
    private List<Course> courses;

    public Student(String name, String phone, int age, double gpa) {
        super(name, phone, age);
        this.gpa = gpa;
        this.courses = new ArrayList<>();
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
        return "Student: " + getName() + ", Phone: " + phone + ", Age: " + age + ", GPA: " + gpa;
    }

    @Override
    public double getSalary() {
        return 0;
    }
}
