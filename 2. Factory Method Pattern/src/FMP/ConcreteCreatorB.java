package FMP;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product FactoryMethod()
    {
        return new ConcreteProductB();
    }
}
