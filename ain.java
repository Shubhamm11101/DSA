// Base class
class Base {
    private int baseValue;

    // Parameterized constructor
    public Base(int baseValue) {
        this.baseValue = baseValue;
        System.out.println("Base class constructor called with baseValue: " + baseValue);
    }
}

// Derived class
class Derived extends Base {
    private int derivedValue;

    // Parameterized constructor
    public Derived(int baseValue, int derivedValue) {
        super(baseValue); // Calling base class constructor with super()
        this.derivedValue = derivedValue;
        System.out.println("Derived class constructor called with derivedValue: " + derivedValue);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Derived class
        Derived derivedObj = new Derived(10, 20);
    }
}