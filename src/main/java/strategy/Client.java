package strategy;

/**
 * Created by helmeter on 5/4/16.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context(strategy);
        context.contextInterface();
    }
}
