package state;

/**
 * Created by helmeter on 5/4/16.
 */
public class Client {
    public static  void main(String[] args) {
        State state = new ConcreteStateA();
        Context context = new Context();
        context.setState(state);
        context.request("AAA");
    }
}
