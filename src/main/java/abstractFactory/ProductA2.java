package abstractFactory;


public class ProductA2 implements AbstractProductA {

    public String doSomething() {
        String clsName = this.getClass().getName();
        System.out.println(clsName + " doSomething");
        return clsName;
    }
}

