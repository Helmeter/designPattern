package Decorator;

/**
 * Created by helmeter on 5/3/16.
 */
public class ConcreteDecoratorB extends Decorator {

    private void addBehavior(){
        System.out.println("has a new method");
    };

    public void opration(){
        super.opration();
        addBehavior();
    }
}
