public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
        this.position = "";
        this.salary = 0.0;
    }

    public Employee(String name, int age, String id, String position, double salary) {
        super(name, age, id);
        this.position = position;
        this.salary = salary;
    }

    // Getters and setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
