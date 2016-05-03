package adapter;

/**
 * Created by helmeter on 5/3/16.
 */
/**
 *  适配器
 */

public class Adapter implements Target {
    // 持有被适配者对象
    private Adaptee adaptee;

    public  Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    // 进行适配
    public void request(){
        this.adaptee.specificRequest();
    }


}