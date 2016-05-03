package Decorator;

/**
 * Created by helmeter on 5/3/16.
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    public void opration(){
        super.opration();
        addedState = "new state";
        System.out.println("this class has a "+addedState);
    }
}
