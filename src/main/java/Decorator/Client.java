package Decorator;

/**
 * Created by helmeter on 5/3/16.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteComponent);
        System.out.println("A装饰后");
        concreteDecoratorA.opration();
        System.out.println("B装饰后");
        concreteDecoratorB.opration();

    }
}
