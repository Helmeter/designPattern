package state;
/**
 * Created by helmeter on 5/4/16.
 */
public class ConcreteStateB implements State {

    public void handle(String para) {
        System.out.println("ConcreteStateB handle:" + para);
    }
}
