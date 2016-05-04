package templateMethod;

/**
 * Created by helmeter on 5/4/16.
 */
public abstract class  AbstractClass {
    public abstract void doPrimitiveOperation1();

    public abstract void doPrimitiveOperation2();

    public final void templateMethod() {
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }

}
