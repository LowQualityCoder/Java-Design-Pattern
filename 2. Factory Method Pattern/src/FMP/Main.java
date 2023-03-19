package FMP;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)
    {
        Creator[] creators = new Creator[2];

        creators[0] = new ConcreteCreatorA();
        creators[1] = new ConcreteCreatorB();

        for(int i=0;i<creators.length;i++)
        {
            Creator creator = creators[i];
            Product product = creator.FactoryMethod();
            System.out.println("Created " + product.getClass().getName());
        }
    }
}
