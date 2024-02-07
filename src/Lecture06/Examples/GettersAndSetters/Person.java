package Lecture06.Examples.GettersAndSetters;

class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // If the age is negative number, sets the default value "0"
        if (age >= 0) {
            this.age = age;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Person newPersonDani = new Person();
        newPersonDani.setAge(-5);
        System.out.println(newPersonDani.getAge());
    }
}
