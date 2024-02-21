package Lecture08.Exercises.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employeeDaniel = new Employee(1, 200, "Daniel", "Takev");
//        String name = employeeDaniel.getName();
//        double annualSalary = employeeDaniel.getAnnualSalary();
        employeeDaniel.raiseSalary(10);
        System.out.println(employeeDaniel);
    }
}
