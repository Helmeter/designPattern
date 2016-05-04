package flyweight;



/**
 * Created by helmeter on 5/4/16.
 */

public class ConcreteFlyweight implements Flyweight {

    private String state;
    public  ConcreteFlyweight(String state) {
        this.state = state;
    }


    public void operation(String para) {
        System.out.println("ConcreteFlyweight: " + state);
    }
}
