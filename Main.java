// Parent class
class Person {
    public void occupation() {
        System.out.println("Undefined occupation");
    }
}

// Derived class
class Employee extends Person {
    @Override
    public void occupation() {
        System.out.println("Employee");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        
        person.occupation(); // Output: Undefined occupation
        employee.occupation(); // Output: Employee
    }
}