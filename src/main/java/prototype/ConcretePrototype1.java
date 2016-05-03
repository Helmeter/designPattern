package prototype;

/**
 * Created by helmeter on 5/3/16.
 */
//继承抽象类,必须实现抽象类的抽象方法
//若父类无默认构造方法,则子类必须声明构造方法
public class ConcretePrototype1 extends Prototype {

    public void show(){

        System.out.println("原型模式实现类");
    }




}
