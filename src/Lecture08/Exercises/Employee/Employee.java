package Lecture08.Exercises.Employee;

public class Employee {
    private final int id;
    private double salaryPerMonth;
    private final String firstName;
    private final String lastName;

    public Employee(int id, double salaryPerMonth, String firstName, String lastName) {
        this.id = id;
        this.salaryPerMonth = salaryPerMonth;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public double raiseSalary(int percent) {
        this.salaryPerMonth += ( this.salaryPerMonth * percent ) / 100;
        return this.salaryPerMonth;
    }

    public double getAnnualSalary() {
        return this.salaryPerMonth * 12;
    }

    @Override
    public String toString() {
        StringBuilder myStringBuilder = new StringBuilder();
        myStringBuilder.append("Employee name: ").append(this.getName());
        myStringBuilder.append("\n");
        myStringBuilder.append("Employee annual salary ").append(this.getAnnualSalary());
        myStringBuilder.append("\n");
        myStringBuilder.append("Employee current salary ").append(this.salaryPerMonth);
        return myStringBuilder.toString();
    }
}
