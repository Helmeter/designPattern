package templateMethod;
/**
 * Created by helmeter on 5/4/16.
 */
public class ConcreteClass1 extends AbstractClass {

    @Override
    public void doPrimitiveOperation1() {
        System.out.println("ConcreteClass1::doPrimitiveOperation1()");
    }

    @Override
    public void doPrimitiveOperation2() {
        System.out.println("ConcreteClass1::doPrimitiveOperation2()");
    }
}
