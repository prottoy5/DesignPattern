//Create a Factory interface and its concrete implementations to create objects based on the interface.

public interface ProductFactory {
    Product createProduct();
}

class ConcreteProductAFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteProductBFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

