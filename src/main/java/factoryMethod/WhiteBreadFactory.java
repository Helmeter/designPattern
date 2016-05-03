package factoryMethod;

/**
 * Created by helmeter on 5/3/16.
 */
public class WhiteBreadFactory implements Ifactory {
    public BreadMaker CreateBread() {
        return new WhiteBread();
    }
}
