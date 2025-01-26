import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String Surname;
    private int department;
    private final int id;
    private double salary;
    private static int idCounter = 1;

    public Employee(String lastName,String firstName, String Surname, int department, int id, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Surname = Surname;
        this.department = department;
        this.id = idCounter++;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return Surname;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Имя: " + firstName +
                ", Фамилия: " + lastName +
                ", Отчество: " + Surname +
                ", Отдел: " + department +
                ", ID: " + id +
                ", Зарплата: " + salary;
    }

}