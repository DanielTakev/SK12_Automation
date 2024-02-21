import Lecture02.DataTypesDemo;
import Lecture07.Examples.Constructors.Employee;
import Lecture07.Examples.Constructors.MyClass;
import Lecture07.Exercises.Car;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Example how to execute main method from another class

//        DataTypesDemo DataTypesInstance = new DataTypesDemo();
//        DataTypesInstance.main(args);
//
//        Employee danielTakev = new Employee("Daniel", "Takev", 1991);
//        Employee rumenaAnastasova = new Employee("Rumena", "Anastasova", 1997);
//        Employee nikolay = new Employee("Nikolay", "Tenev", 1993);
//        int birthYearDaniel = danielTakev.getBirthYear();
//        int birthYearRumi = rumenaAnastasova.getBirthYear();
//        int birthYearNiki = nikolay.getBirthYear();
//        System.out.println(birthYearDaniel);
//        System.out.println(birthYearNiki);
//        System.out.println(birthYearRumi);
//
//        // Other example
//        MyClass newInstanceOfMyClass = new MyClass(11);
//        MyClass newInstanceOfMyClass2 = new MyClass();
//        int myClassNumberWithParam = newInstanceOfMyClass.getTheNumber();
//        int myClassNumberWithoutParam = newInstanceOfMyClass2.getTheNumber();
//
//        System.out.println(myClassNumberWithParam);
//        System.out.println(myClassNumberWithoutParam);

        Car myNewCar = new Car("Tesla", "black", true);
//        System.out.println(myNewCar.getReleaseYear());
        myNewCar.setName("Volga");
        System.out.println(myNewCar.getName());
    }
}