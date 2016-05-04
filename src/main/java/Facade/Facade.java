package Facade;

/**
 * Created by helmeter on 5/3/16.
 */
public class Facade {
    public void test(){
        AModuleApi a = new AModuleImpl();
        a.testA();

        BModuleApi b = new BModuleImpl();
        b.testB();

        CModuleApi c = new CModuleImpl();
        c.testC();
    }
}
