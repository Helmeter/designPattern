package factoryMethod;

/**
 * Created by helmeter on 5/3/16.
 */
public class HoneyBreadFactory implements Ifactory {
    public BreadMaker CreateBread() {

        return  new HoneyBread();
    }
}
