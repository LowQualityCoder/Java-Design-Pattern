package FMP;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product FactoryMethod()
    {
        return new ConcreteProductA();
    }
}
