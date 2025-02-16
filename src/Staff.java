public class Staff extends Person {
    private double salary;

    public Staff(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String getDetails() {
        return "Staff: " + getName() + ", Phone: " + phone + ", Age: " + age + ", Salary: " + salary;
    }
}
