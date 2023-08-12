//Define an interface for the objects want to create.
public interface Product {
    void displayInfo();
}

//Create concrete classes that implement the Product interface.

class ConcreteProductA implements Product {
    @Override
    public void displayInfo() {
        System.out.println("This is Concrete Product A");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void displayInfo() {
        System.out.println("This is Concrete Product B");
    }
}

