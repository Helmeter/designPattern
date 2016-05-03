package factoryMethod;

/**
 * Created by helmeter on 5/3/16.
 */
public class Client {

    public static void main(String[] args) {
        BreadMaker breadMaker;
        Ifactory ifactory = new WhiteBreadFactory();
        breadMaker = ifactory.CreateBread();
        breadMaker.getBread();
    }
}
