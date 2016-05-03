package adapter;

/**
 * Created by helmeter on 5/3/16.
 */
public class Client {

    public static void main(String[] args){
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
